package com.example.shop.pdf;

import com.example.shop.cart.Cart;
import com.example.shop.product.Product;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;

public class PdfGenerator {
    public static byte[] generatePdf(Cart cart) throws DocumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Document document = new Document();

        PdfWriter.getInstance(document, byteArrayOutputStream);
        document.open();

        addTitle(document);
        addTable(document, cart);

        document.close();

        return byteArrayOutputStream.toByteArray();
    }

    private static void addTitle(Document document) throws DocumentException {
        Paragraph title = new Paragraph("Cart");
        title.setAlignment(Element.ALIGN_CENTER);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 36, Font.BOLD);
        title.setFont(font);
        title.setSpacingAfter(10f);
        document.add(title);
    }

    private static void addTable(Document document, Cart cart) throws DocumentException {
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        float[] columnWidths = {3f, 4f, 3f};
        table.setWidths(columnWidths);

        addTableHeader(table);

        for (Product product : cart.getProducts()) {
            addRow(table, product, cart.getQuantities().get(product.getId()));
        }

        addTotalPrice(table, cart);

        document.add(table);
    }

    private static void addTableHeader(PdfPTable table) {
        PdfPCell idHeader = new PdfPCell(new Paragraph("ID"));
        idHeader.setBorderColor(BaseColor.BLACK);
        idHeader.setPaddingLeft(10);
        idHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        idHeader.setVerticalAlignment(Element.ALIGN_CENTER);
        idHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
        idHeader.setExtraParagraphSpace(5f);
        table.addCell(idHeader);

        PdfPCell nameHeader = new PdfPCell(new Paragraph("Product"));
        nameHeader.setBorderColor(BaseColor.BLACK);
        nameHeader.setPaddingLeft(10);
        nameHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        nameHeader.setVerticalAlignment(Element.ALIGN_CENTER);
        nameHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
        nameHeader.setExtraParagraphSpace(5f);
        table.addCell(nameHeader);

        PdfPCell quantityHeader = new PdfPCell(new Paragraph("Quantity"));
        quantityHeader.setBorderColor(BaseColor.BLACK);
        quantityHeader.setPaddingLeft(10);
        quantityHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        quantityHeader.setVerticalAlignment(Element.ALIGN_CENTER);
        quantityHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
        quantityHeader.setExtraParagraphSpace(5f);
        table.addCell(quantityHeader);
    }

    private static void addRow(PdfPTable table, Product product, int quantity) {
        PdfPCell idCell = new PdfPCell(new Paragraph(String.valueOf(product.getId())));
        idCell.setBorderColor(BaseColor.BLACK);
        idCell.setPaddingLeft(10);
        idCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        idCell.setVerticalAlignment(Element.ALIGN_CENTER);
        idCell.setExtraParagraphSpace(5f);
        table.addCell(idCell);

        PdfPCell nameCell = new PdfPCell(new Paragraph(product.getName()));
        nameCell.setBorderColor(BaseColor.BLACK);
        nameCell.setPaddingLeft(10);
        nameCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        nameCell.setVerticalAlignment(Element.ALIGN_CENTER);
        nameCell.setExtraParagraphSpace(5f);
        table.addCell(nameCell);

        PdfPCell quantityCell = new PdfPCell(new Paragraph(String.valueOf(quantity)));
        quantityCell.setBorderColor(BaseColor.BLACK);
        quantityCell.setPaddingLeft(10);
        quantityCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        quantityCell.setVerticalAlignment(Element.ALIGN_CENTER);
        quantityCell.setExtraParagraphSpace(5f);
        table.addCell(quantityCell);
    }

    private static void addTotalPrice(PdfPTable table, Cart cart) {
        PdfPCell totalHeader = new PdfPCell(new Paragraph("Total price:"));
        totalHeader.setColspan(2);
        totalHeader.setBorderColor(BaseColor.BLACK);
        totalHeader.setPaddingLeft(10);
        totalHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        totalHeader.setVerticalAlignment(Element.ALIGN_CENTER);
        totalHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
        totalHeader.setExtraParagraphSpace(5f);
        table.addCell(totalHeader);

        PdfPCell totalCell = new PdfPCell(new Paragraph(String.valueOf(cart.getTotalPrice())));
        totalCell.setBorderColor(BaseColor.BLACK);
        totalCell.setPaddingLeft(10);
        totalCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        totalCell.setVerticalAlignment(Element.ALIGN_CENTER);
        totalCell.setExtraParagraphSpace(5f);
        table.addCell(totalCell);
    }
}
