/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Razia
 */
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class PaymentItem {
      private String invoiceNumber, amountPaid, methodOfPayment, visaCard, debitCard, masterCard,
            creditCard, directDebit, visaDebitCard, cashPaid, patientId, perPaidPlan, patientNhsNumber, medicineName;
    private int numberOfTablets, medicinePrice;

    public PaymentItem() {
        this.invoiceNumber = "";
        this.amountPaid = "";
        this.methodOfPayment = "";
        this.visaCard = "";
        this.debitCard = "";
        this.masterCard = "";
        this.medicineName = "";
        this.creditCard = "";
        this.directDebit = "";
        this.visaDebitCard = "";
        this.cashPaid = "";
        this.patientId = "";
        this.perPaidPlan = "";
        this.patientNhsNumber = "";
        this.numberOfTablets = 0;
        this.medicinePrice = 0;
}
     public PaymentItem(String invoiceNumber, String amountPaid, String methodOfPayment, String visaCard,
                       String debitCard, String masterCard, String medicineName, int numberOfTablets,
                      int medicinePrice, String creditCard,
                       String directDebit,
                       String visaDebitCard, String cashPaid, String patientId, String perPaidPlan, String patientNhsNumber) {
        this.invoiceNumber = invoiceNumber;
        this.amountPaid = amountPaid;
        this.methodOfPayment = methodOfPayment;
        this.visaCard = visaCard;
        this.debitCard = debitCard;
        this.masterCard = masterCard;
        this.medicineName = medicineName;
        this.numberOfTablets = numberOfTablets;
        this.medicinePrice = medicinePrice;
        this.creditCard = creditCard;
        this.directDebit = directDebit;
        this.visaDebitCard = visaDebitCard;
        this.cashPaid = cashPaid;
        this.patientId = patientId;
        this.perPaidPlan = perPaidPlan;
        this.patientNhsNumber = patientNhsNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getMethodOfPayment() {
        return methodOfPayment;
    }

    public void setMethodOfPayment(String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public String getVisaCard() {
        return visaCard;
    }

    public void setVisaCard(String visaCard) {
        this.visaCard = visaCard;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }

    public String getMasterCard() {
        return masterCard;
    }

    public void setMasterCard(String masterCard) {
        this.masterCard = masterCard;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getNumberOfTablets() {
        return numberOfTablets;
    }

    public void setNumberOfTablets(int numberOfTablets) {
        this.numberOfTablets = numberOfTablets;
    }

    public int getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(int medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(String directDebit) {
        this.directDebit = directDebit;
    }

    public String getVisaDebitCard() {
        return visaDebitCard;
    }

    public void setVisaDebitCard(String visaDebitCard) {
        this.visaDebitCard = visaDebitCard;
    }

    public String getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(String cashPaid) {
        this.cashPaid = cashPaid;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPerPaidPlan() {
        return perPaidPlan;
    }

    public void setPerPaidPlan(String perPaidPlan) {
        this.perPaidPlan = perPaidPlan;
    }

    public String getPatientNhsNumber() {
        return patientNhsNumber;
    }

    public void setPatientNhsNumber(String patientNhsNumber) {
        this.patientNhsNumber = patientNhsNumber;
    }
}

public class PaymentViewItem {
    private TableView<PaymentItem> tableView = new TableView<>();

    // Creating a confirm box to show which shows do you want to close the window or not
    private boolean confirmDisplay() {
        AtomicBoolean result = new AtomicBoolean(false);
        Stage window = new Stage();

        window.setTitle("Confirm");
        window.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label("Are your sure you want to close the window?");
        Button yesButton = new Button("Yes");
        yesButton.setMinWidth(100);
        yesButton.setStyle("-fx-background-color: #e63946;");
        yesButton.setTextFill(Paint.valueOf("#fff"));
        Button noButton = new Button("No");
        noButton.setMinWidth(100);

        VBox vbox = new VBox(20);
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(yesButton, noButton);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().addAll(label, hBox);

        yesButton.setOnAction(event -> {
            result.set(true);
            window.close();
        });

        noButton.setOnAction(event -> {
            result.set(false);
            window.close();
        });

        Scene scene = new Scene(vbox, 250, 70);

        window.setScene(scene);
        window.setResizable(false);
        window.showAndWait();

        return result.get();
    }

//        public ObservableList<PaymentItem> getItems() {
//            ObservableList<PaymentItem> items = FXCollections.observableArrayList();
//            // Work on progress
//            items.add(new DoctorItem())
//
//            return items;
//        }

    public void addItem(String invoiceNumber, String amountPaid, String methodOfPayment, String visaCard,
                        String debitCard, String masterCard, String medicineName, String numberOfTablets,
                        String medicinePrice,
                        String creditCard,
                        String directDebit, String visaDebitCard,
                        String cashPaid, String patientId, String perPaidPlan, String patientNhsNumber) throws IOException {
        PaymentItem paymentItem = new PaymentItem();

        paymentItem.setInvoiceNumber(invoiceNumber);
        paymentItem.setAmountPaid(amountPaid);
        paymentItem.setMethodOfPayment(methodOfPayment);
        paymentItem.setVisaCard(visaCard);
        paymentItem.setDebitCard(debitCard);
        paymentItem.setMasterCard(masterCard);
        paymentItem.setMedicineName(medicineName);
        paymentItem.setNumberOfTablets(Integer.parseInt(numberOfTablets));
        paymentItem.setMedicinePrice(Integer.parseInt(medicinePrice));
        paymentItem.setCreditCard(creditCard);
        paymentItem.setDirectDebit(directDebit);
        paymentItem.setVisaDebitCard(visaDebitCard);
        paymentItem.setCashPaid(cashPaid);
        paymentItem.setPatientId(patientId);
        paymentItem.setPerPaidPlan(perPaidPlan);
        paymentItem.setPatientNhsNumber(patientNhsNumber);

        String line =
                paymentItem.getInvoiceNumber() + "," + paymentItem.getAmountPaid() + "," + paymentItem.getMethodOfPayment() +"," + paymentItem.getVisaCard() + "," + paymentItem.getDebitCard() +
                "," +
                paymentItem.getMasterCard() + "," + paymentItem.getMedicineName() + paymentItem.getNumberOfTablets() + paymentItem.getMedicinePrice() + "," +
                        paymentItem.getCreditCard() + "," + paymentItem.getDirectDebit() + "," + paymentItem.getVisaDebitCard() +
                        "," + paymentItem.getCashPaid() +
                        "," +
                paymentItem.getPatientId() + "," + paymentItem.getPerPaidPlan() + "," + paymentItem.getPatientNhsNumber();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\data\\Payment.csv", true))) {
            writer.write(line + "\n");
        }

        tableView.getItems().add(paymentItem);   // Adding all the items

        Stage window = new Stage();
        window.setTitle("Information");

        BorderPane borderPane = new BorderPane();

        VBox vBox = new VBox(15);
        Label label = new Label("Added successfully.");

        Button button = new Button("Ok");
        button.setMinWidth(100);
        button.setMinHeight(30);
        button.setOnAction(e -> window.close());

        vBox.getChildren().addAll(label, button);
        borderPane.setMargin(vBox, new Insets(5, 0, 0, 70));

        borderPane.setCenter(vBox);

        Scene scene = new Scene(borderPane, 250, 70);

        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public void printItem(String invoiceNumber, String amountPaid, String methodOfPayment, String visaCard,
                          String debitCard, String masterCard, String medicineName,
                          String numberOfTablets, String medicinePrice, String creditCard,
                          String directDebit, String visaDebitCard,
                          String cashPaid, String patientId, String perPaidPlan, String patientNhsNumber) throws IOException {
        PaymentItem paymentItem = new PaymentItem();

        paymentItem.setInvoiceNumber(invoiceNumber);
        paymentItem.setAmountPaid(amountPaid);
        paymentItem.setMethodOfPayment(methodOfPayment);
        paymentItem.setVisaCard(visaCard);
        paymentItem.setDebitCard(debitCard);
        paymentItem.setMasterCard(masterCard);
        paymentItem.setMedicineName(medicineName);
        paymentItem.setNumberOfTablets(Integer.parseInt(numberOfTablets));
        paymentItem.setMedicinePrice(Integer.parseInt(medicinePrice));
        paymentItem.setCreditCard(creditCard);
        paymentItem.setDirectDebit(directDebit);
        paymentItem.setVisaDebitCard(visaDebitCard);
        paymentItem.setCashPaid(cashPaid);
        paymentItem.setPatientId(patientId);
        paymentItem.setPerPaidPlan(perPaidPlan);
        paymentItem.setPatientNhsNumber(patientNhsNumber);

        String line =
                paymentItem.getInvoiceNumber() + "," + paymentItem.getAmountPaid() + "," + paymentItem.getMethodOfPayment() +"," + paymentItem.getVisaCard() + "," + paymentItem.getDebitCard() +
                        "," +
                        paymentItem.getMasterCard() + paymentItem.getMedicineName() + paymentItem.getNumberOfTablets() + paymentItem.getMedicinePrice()
                        + "," + paymentItem.getCreditCard() + "," + paymentItem.getDirectDebit() + "," + paymentItem.getVisaDebitCard() +
                        "," + paymentItem.getCashPaid() +
                        "," +
                        paymentItem.getPatientId() + "," + paymentItem.getPerPaidPlan() + "," + paymentItem.getPatientNhsNumber();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\data\\Payment.csv", true))) {
            writer.write(line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        tableView.getItems().add(paymentItem);   // Adding all the items

        Stage window = new Stage();
        window.setTitle("Paid Slip");
        window.initModality(Modality.APPLICATION_MODAL);

        // Main layout
        BorderPane borderPane = new BorderPane();

        // Layouts
        VBox vBox1 = new VBox(10);
        VBox vBox2 = new VBox(10);
        HBox hBox = new HBox(20);

        Label label = new Label("Medical Store");
        label.setTextFill(Paint.valueOf("#fff"));
        label.setPadding(new Insets(20, 0, 0, 0));
        label.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        label.setTextFill(Paint.valueOf("#1d3557"));
        borderPane.setTop(label);
        borderPane.setAlignment(label, Pos.TOP_CENTER);

        Label invoice = new Label("Invoice No: ");
        invoice.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label Patientid = new Label("Patient ID: ");
        Patientid.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label nhsNumber = new Label("Patient NHS No: ");
        nhsNumber.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label tabletPurchased = new Label("Number of Tablet Purchased: ");
        tabletPurchased.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label methodPayment = new Label("Method of Payment: ");
        methodPayment.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label totalAmount = new Label("Total Bill: ");
        totalAmount.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label paidAmount = new Label("Total Paid Amount: ");
        paidAmount.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label returnedAmount = new Label("Returned Amount: ");
        returnedAmount.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        vBox1.setMargin(invoice, new Insets(-1, 0, 0, 0));
        vBox1.getChildren().addAll(invoice, Patientid, nhsNumber, tabletPurchased, methodPayment, totalAmount,
                paidAmount, returnedAmount);

        Label invoiceOutput = new Label(paymentItem.getInvoiceNumber());
        invoiceOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label PatientidOutput = new Label(paymentItem.getPatientId());
        PatientidOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label nhsNumberOutput = new Label(paymentItem.getPatientNhsNumber());
        nhsNumberOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label tabletPurchasedOutput = new Label(String.valueOf(paymentItem.getNumberOfTablets()));
        tabletPurchasedOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label methodPaymenyOutput = new Label(paymentItem.getMethodOfPayment());
        methodPaymenyOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label totalAmountOutput = new Label(String.valueOf(paymentItem.getMedicinePrice() * paymentItem.getNumberOfTablets()));
        totalAmountOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label paidAmountOutput = new Label(paymentItem.getAmountPaid());
        paidAmountOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label returnedAmountOutput =
                new Label(String.valueOf(Integer.parseInt(paymentItem.getAmountPaid()) - (paymentItem.getMedicinePrice() * paymentItem.getNumberOfTablets())));
        returnedAmountOutput.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        vBox2.getChildren().addAll(invoiceOutput, PatientidOutput, nhsNumberOutput, tabletPurchasedOutput,
                methodPaymenyOutput, totalAmountOutput,
                paidAmountOutput, returnedAmountOutput);

        hBox.getChildren().addAll(vBox1, vBox2);

        borderPane.setCenter(hBox);
        borderPane.setMargin(hBox, new Insets(50, 0, 0, 50));
        borderPane.setStyle("-fx-background-color: #f7ede2");

        Scene scene = new Scene(borderPane, 400, 350);
        window.setScene(scene);
        window.setResizable(false);
        window.showAndWait();
    }

    public void deleteItem() {
        ObservableList<PaymentItem> items;
        items = tableView.getItems();
        items.remove(tableView.getSelectionModel().getSelectedItem());
    }

    public void perform() {
        Stage window = new Stage();
        window.setTitle("Payment Data");

        BorderPane borderPane = new BorderPane();

        // Columns
        TableColumn<PaymentItem, String> invoiceNumberColumn = new TableColumn<>("Invoice No.");
        invoiceNumberColumn.setCellValueFactory(new PropertyValueFactory<>("invoiceNumber"));

        TableColumn<PaymentItem, String> amountPaidColumn = new TableColumn<>("Amount Paid");
        amountPaidColumn.setCellValueFactory(new PropertyValueFactory<>("amountPaid"));

        TableColumn<PaymentItem, String> methodOfPaymentColumn = new TableColumn<>("Method of Payment");
        methodOfPaymentColumn.setCellValueFactory(new PropertyValueFactory<>("methodOfPayment"));

        TableColumn<PaymentItem, String> visaCardColumn = new TableColumn<>("Visa Card");
        visaCardColumn.setCellValueFactory(new PropertyValueFactory<>("visaCard"));

        TableColumn<PaymentItem, String> debitCardColumn = new TableColumn<>("Debit Card");
        debitCardColumn.setCellValueFactory(new PropertyValueFactory<>("debitCard"));

        TableColumn<PaymentItem, String> masterCardColumn = new TableColumn<>("Master Card");
        masterCardColumn.setCellValueFactory(new PropertyValueFactory<>("masterCard"));

        TableColumn<PaymentItem, String> creditCardColumn = new TableColumn<>("Credit Card");
        creditCardColumn.setCellValueFactory(new PropertyValueFactory<>("creditCard"));

        TableColumn<PaymentItem, String> directDebitColumn = new TableColumn<>("Direct Debit");
        directDebitColumn.setCellValueFactory(new PropertyValueFactory<>("directDebit"));

        TableColumn<PaymentItem, String> visaDebitCardColumn = new TableColumn<>("Visa Debit Card");
        visaDebitCardColumn.setCellValueFactory(new PropertyValueFactory<>("visaDebitCard"));

        TableColumn<PaymentItem, String> cashPaidColumn = new TableColumn<>("Cash Paid");
        cashPaidColumn.setCellValueFactory(new PropertyValueFactory<>("cashPaid"));

        TableColumn<PaymentItem, String> patientIdColumn = new TableColumn<>("Patient ID");
        patientIdColumn.setCellValueFactory(new PropertyValueFactory<>("patientId"));

        TableColumn<PaymentItem, String> perPaidPlanColumn = new TableColumn<>("Per Paid Plan");
        perPaidPlanColumn.setCellValueFactory(new PropertyValueFactory<>("perPaidPlan"));

        TableColumn<PaymentItem, String> patientNhsNumberColumn = new TableColumn<>("Patient NHS No.");
        patientNhsNumberColumn.setCellValueFactory(new PropertyValueFactory<>("patientNhsNumber"));

//        tableView.getItems().addAll(getItems())
        tableView.getColumns().addAll(invoiceNumberColumn, amountPaidColumn, methodOfPaymentColumn, visaCardColumn,
                debitCardColumn, masterCardColumn, creditCardColumn, directDebitColumn, visaDebitCardColumn,
                cashPaidColumn, patientIdColumn, perPaidPlanColumn, patientNhsNumberColumn);

        borderPane.setCenter(tableView);

        HBox hBox = new HBox(20);

        Button deleteButton = new Button("Delete");
        deleteButton.setMinHeight(30);
        deleteButton.setMinWidth(100);
        deleteButton.setOnAction(e -> deleteItem());
        deleteButton.setTextFill(Paint.valueOf("#fff"));
        deleteButton.setStyle("-fx-background-color: #4f6367");

        Button closeButton = new Button("Close");
        closeButton.setMinHeight(30);
        closeButton.setMinWidth(100);
        closeButton.setOnAction(e -> window.close());
        closeButton.setTextFill(Paint.valueOf("#fff"));
        closeButton.setStyle("-fx-background-color: #ff6b6c");

        hBox.getChildren().addAll(deleteButton, closeButton);
        borderPane.setMargin(hBox, new Insets(0, 0, 0, 300));
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 800, 600);

        window.setScene(scene);
        window.show();
    }
}
