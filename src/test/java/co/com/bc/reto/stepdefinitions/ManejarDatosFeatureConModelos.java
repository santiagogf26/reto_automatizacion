package co.com.bc.reto.stepdefinitions;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;


import java.lang.reflect.Type;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import static java.util.Locale.ENGLISH;

public class ManejarDatosFeatureConModelos implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        Transformer transformer = new Transformer();
        typeRegistry.setDefaultDataTableCellTransformer(transformer);
        typeRegistry.setDefaultDataTableEntryTransformer(transformer);
        typeRegistry.setDefaultParameterTransformer(transformer);
    }


    private class Transformer
            implements ParameterByTypeTransformer, TableEntryByTypeTransformer, TableCellByTypeTransformer {
        ObjectMapper objectMapper = new ObjectMapper();

        // Now it starts to work as before

        @Override
        public Object transform(String s, Type type) {
            return objectMapper.convertValue(s, objectMapper.constructType(type));
        }

        @Override
        public <T> T transform(Map<String, String> map, Class<T> aClass,
                               TableCellByTypeTransformer tableCellByTypeTransformer) {
            Map<String, String> convertedMap = convertMap(map);
            return objectMapper.convertValue(convertedMap, aClass);
        }

        @Override
        public <T> T transform(String s, Class<T> aClass) {
            return objectMapper.convertValue(s, aClass);
        }

        private Map<String, String> convertMap(Map<String, String> map) {
            Set<String> keys = map.keySet();
            Map<String, String> outputMap = new Hashtable<String, String>();
            for (String key : keys) {
                String objectValue = map.get(key);
                String newkey = convertKey(key);
                outputMap.put(newkey, objectValue);
            }
            return outputMap;
        }

        private String convertKey(String key) {
            return camelCase(key);
        }

        private String camelCase(String key) {
            StringBuilder output = new StringBuilder();
            boolean previousSpace = false;
            if (key.length() < 1)
                return "";
            output.append(Character.toLowerCase(key.charAt(0)));
            for (int i = 1; i < key.length(); i++) {
                char c = key.charAt(i);
                if (c != ' ') {
                    if (previousSpace)
                        output.append(Character.toUpperCase(c));
                    else
                        output.append(c);
                    previousSpace = false;
                } else
                    previousSpace = true;
            }
            return output.toString();
        }
    }
}

