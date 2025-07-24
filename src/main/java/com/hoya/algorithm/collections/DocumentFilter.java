package com.hoya.algorithm.collections;

import java.util.List;
import java.util.Map;

public class DocumentFilter {

    public static List<Map<String, String>> filterDocs(List<Map<String, String>> documents) {

        return documents.stream()
                .filter(d -> d.get("type").equals("contract") && d.get("status").equals("active"))
                .toList();

    }
}
