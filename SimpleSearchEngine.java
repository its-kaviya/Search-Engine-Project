import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleSearchEngine {
    private Map<String, String> documents;

    public SimpleSearchEngine() {
        documents = new HashMap<>();
    }

    public void addDocument(String documentId, String content) {
        documents.put(documentId, content);
    }

    public void search(String query) {
        for (Map.Entry<String, String> entry : documents.entrySet()) {
            String documentId = entry.getKey();
            String content = entry.getValue();
            if (content.toLowerCase().contains(query.toLowerCase())) {
                System.out.println("Match found in document " + documentId);
            }
        }
    }

    public static void main(String[] args) {
        SimpleSearchEngine searchEngine = new SimpleSearchEngine();
        searchEngine.addDocument("doc1", "This is the first document");
        searchEngine.addDocument("doc2", "This document contains important information");
        searchEngine.addDocument("doc3", "Here's another document for testing");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your search query: ");
        String query = scanner.nextLine();
        searchEngine.search(query);
    }
}
