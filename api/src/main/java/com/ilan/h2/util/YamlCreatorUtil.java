package com.ilan.h2.util;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class YamlCreatorUtil {


    public static String yamlDoc(Properties properties) {
        Map<String, Object> root = new TreeMap<>();
        for (String key : properties.stringPropertyNames()) {
            addToMap(root, key.split("\\."), properties.getProperty(key));
        }

        // Set up the DumperOptions
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(options);
        return yaml.dump(root);

    }

    private static void addToMap(Map<String, Object> map, String[] path, String value) {
        Map<String, Object> current = map;
        for (int i = 0; i < path.length - 1; i++) {
            String part = path[i];
            if (!current.containsKey(part) || !(current.get(part) instanceof Map)) {
                current.put(part, new HashMap<String, Object>());
            }
            current = (Map<String, Object>) current.get(part);
        }
        current.put(path[path.length - 1], value);

    }
}
