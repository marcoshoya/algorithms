package com.hoya.algorithm.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocumentFilter {

    public static void main(String[] args) {
        List<Map<String, String>> documents = new ArrayList<>();
        documents.add(Map.of("id", "1", "type", "contract", "status", "active"));
        documents.add(Map.of("id", "2", "type", "nda", "status", "inactive"));
        documents.add(Map.of("id", "3", "type", "contract", "status", "archived"));

        List<Map<String, String>> result = filterDocs(documents);
        System.out.println(result); // [{id=1, type=contract, status=active}]
    }

    private static List<Map<String, String>> filterDocs(List<Map<String, String>> documents) {

        return documents.stream()
                .filter(d -> d.get("type").equals("contract") && d.get("status").equals("active"))
                .toList();

    }
}
