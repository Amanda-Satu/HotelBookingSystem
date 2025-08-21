package za.ac.cput.domain;
import jakarta.persistence.*;
//sphesihle slingile 230310257
import java.time.LocalDate;
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;
    @Column(nullable=false,unique=true)
    private Long booking_id;
    @Column(nullable=false)
    private double amount;
    @Column(nullable=false,unique=true)
    private Long transaction_id;
    @Column(nullable=false)
    private PaymentGateway payment_gateway;
    @Column(nullable=false)
    private LocalDate payment_date;
    @Column(nullable=false)
    private String payment_status;


    public enum PaymentGateway {
        OZOW,
        YOCO,
        PAYFAST,
        MASTERCARD
    }
    protected Payment(){}

    private Payment(Builder builder){
        this.payment_id = builder.payment_id;
        this.booking_id = builder.booking_id;
        this.amount = builder.amount;
        this.transaction_id = builder.transaction_id;
        this.payment_gateway = builder.payment_gateway;
        this.payment_date = builder.payment_date;
        this.payment_status = builder.payment_status;
    }
    public Long getPayment_id(){
        return payment_id;
    }
    public Long getBooking_id(){
        return booking_id;
    }
    public double getAmount(){
        return amount;
    }
    public PaymentGateway getPayment_gateway(){
        return payment_gateway;
    }
    public Long getTransaction_id(){
        return transaction_id;
    }
    public LocalDate getPayment_date(){
        return payment_date;
    }
    public String getPayment_status(){
        return payment_status;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "payment_id=" +payment_id+
                ",booking_id="+booking_id+
                ",transaction_id="+transaction_id+
                ",amount="+amount+'/'+
                "payment_gateway="+payment_gateway+
                ",payment_date="+payment_date+'/'+
                ",payment_status"+payment_status+'/'+
                "}";
    }
    public static class Builder{
        private Long payment_id;
        private Long booking_id;
        private double amount;
        private Long transaction_id;
        private PaymentGateway payment_gateway;
        private LocalDate payment_date;
        private String payment_status;


        public Builder setPayment_id(Long payment_id){
            this.payment_id = payment_id;
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
        public Builder setPayment_gateway(PaymentGateway payment_gateway){
            this.payment_gateway = payment_gateway;
            return this;
        }
        public Builder setPayment_date(LocalDate payment_date){
            this.payment_date = payment_date;
            return this;
        }
        public Builder setPayment_status(String payment_status){
            this.payment_status = payment_status;
            return this;
        }
        public Payment build(){
            return new Payment(this);
        }
    }
}


