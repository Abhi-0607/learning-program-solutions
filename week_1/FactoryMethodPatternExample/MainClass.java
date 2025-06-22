import documents.Document;
import factories.DocumentFactory;
import factories.ExcelDocumentFactory;
import factories.PdfDocumentFactory;
import factories.WordDocumentFactory;

public class MainClass {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();

        DocumentFactory PdfFactory = new PdfDocumentFactory();
        Document pdfDocument = PdfFactory.createDocument();
        pdfDocument.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
    
    }
}