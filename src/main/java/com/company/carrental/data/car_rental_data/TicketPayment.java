package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_Payment")
public class TicketPayment {
    private Integer ticketPaymentId;
    private Integer ticketId;
    private String paymentTypeId;
    private Float Amount;
    private Integer cardNo;
    private String chequeNo;
    private String txnNo;
    private String receiptNo;
    
    @ManyToOne
    TicketMaster ticketMaster;

    @ManyToOne
    @JoinColumn(name="FK_Ticket_Id")
    public TicketMaster getTicketMaster() {
        return ticketMaster;
    }
    public void setTicketMaster(TicketMaster ticketMaster) {
        this.ticketMaster = ticketMaster;
    }
   
    @Id
    @Column(name = "Ticket_Payment_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getTicketPaymentId() {
        return ticketPaymentId;
    }
    public void setTicketPaymentId(Integer ticketPaymentId) {
        this.ticketPaymentId = ticketPaymentId;
    }
    
    
    @Column(name= "Amount",nullable=false)
    public Float getAmount() {
        return Amount;
    }
    public void setAmount(Float amount) {
        Amount = amount;
    }
    
    @Column(name= "CardNo",nullable=false)
    public Integer getCardNo() {
        return cardNo;
    }
    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }
    
    @Column(name= "ChequeNo",nullable=false)
    public String getChequeNo() {
        return chequeNo;
    }
    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }
    
    
    @Column(name= "Txn_No",nullable=false)
    public String getTxnNo() {
        return txnNo;
    }
    
    public void setTxnNo(String txnNo) {
        this.txnNo = txnNo;
    }
    
    @Column(name= "Receipt_No",nullable=false)
    public String getReceiptNo() {
        return receiptNo;
    }
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

}
