package com.hoya.algorithm.collections

import spock.lang.Specification

class DocumentFilterTest extends Specification {

    def 'test filter'() {
        given:
        List<Map<String, String>> documents = new ArrayList<>()
        documents.add(Map.of("id", "1", "type", "contract", "status", "active"))
        documents.add(Map.of("id", "2", "type", "nda", "status", "inactive"))
        documents.add(Map.of("id", "3", "type", "contract", "status", "archived"))

        when:
        def result = DocumentFilter.filterDocs(documents)

        then:
        result.size() == 1
        result.get(0).get('type') == 'contract'
    }
}
