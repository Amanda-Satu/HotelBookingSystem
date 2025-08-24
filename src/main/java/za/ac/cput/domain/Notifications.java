package za.ac.cput.domain;

import jakarta.persistence.*;
//sphesihle slingile 230310257
import java.time.LocalDate;
@Entity
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long notification_id;
    //@OneToOne(cascade = CascadeType.PERSIST)
    //@JoinColumn(name = "booking_id", referencedColumnName="booking_id")
    @Column(nullable = false)
    private Long booking_id;
    @Column(nullable=false)
    private double amount;
    @Column(nullable=false,unique=true)
    private Long transaction_id;
    @Column(nullable=false)
    private PaymentGateway payment_gateway;
    @Column(nullable=false)
    private LocalDate payment_date;


    public enum PaymentGateway{
        OZOW,
        YOCO,
        PAYFAST,
        MASTERCARD
    }
    protected Notifications() {}

    private Notifications(Builder builder){
        this.notification_id = notification_id;
        this.booking_id = booking_id;
        this.amount = amount;
        this.transaction_id = transaction_id;
        this.payment_gateway = payment_gateway;
        this.payment_date = payment_date;
    }
    public Long getNotification_id(){
        return notification_id;
    }
    public Long getBooking_id(){
        return booking_id;
    }
    public double getAmount(){
        return amount;
    }
    public Long getTransaction_id(){
        return transaction_id;
    }
    public PaymentGateway getPayment_gateway(){
        return payment_gateway;
    }
    public LocalDate getPayment_date(){
        return payment_date;
    }
    @Override
    public String toString(){
        return "Notifications{" +
                "notification_id="+notification_id+'/'+
                "booking_id="+booking_id+'/'+
                "amount="+amount+'/'+
                "transaction_id="+transaction_id+'/'+
                "payment_gateway="+payment_gateway+'/'+
                "payment_date="+payment_date+'/'+
                "}";

    }
    public static class Builder{
        private Long notification_id;
        private Long booking_id;
        private double amount;
        private Long transaction_id;
        private PaymentGateway payment_gateway;
        private LocalDate payment_date;

        public Builder setNotification_id(Long notification_id){
            this.notification_id = notification_id;
            return this;
        }
        public Builder setBooking_id(Long booking_id){
            this.booking_id = booking_id;
            return this;
        }
        public Builder setAmount(double amount){

            this.amount = amount;
            return this;
        }
        public Builder setTransaction_id(Long transaction_id){
            this.transaction_id = transaction_id;
            return this;
        }
        public Builder setPayment_gateway(PaymentGateway payment_gateway) {
            this.payment_gateway = payment_gateway;
            return this;
        }
        public Builder setPayment_date(LocalDate payment_date){
            this.payment_date = payment_date;
            return this;
        }
        public Notifications build(){
            return new Notifications(this);
        }


    }

}
