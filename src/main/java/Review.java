package za.ca.cput.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Room room;

    private int rating;

    @Column(length = 1000)
    private String comment;

    private LocalDateTime createdAt;

    protected Review() {}

    private Review(Builder builder) {
        this.reviewId = builder.reviewId;
        this.customer = builder.customer;
        this.room = builder.room;
        this.rating = builder.rating;
        this.comment = builder.comment;
        this.createdAt = builder.createdAt;
    }

    public Long getReviewId() { return reviewId; }
    public Customer getCustomer() { return customer; }
    public Room getRoom() { return room; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", customer=" + (customer != null ? customer.getCustomerId() : null) +
                ", room=" + (room != null ? room.getRoomId() : null) +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public static class Builder {
        private Long reviewId;
        private Customer customer;
        private Room room;
        private int rating;
        private String comment;
        private LocalDateTime createdAt;

        public Builder setReviewId(Long reviewId) { this.reviewId = reviewId; return this; }
        public Builder setCustomer(Customer customer) { this.customer = customer; return this; }
        public Builder setRoom(Room room) { this.room = room; return this; }
        public Builder setRating(int rating) { this.rating = rating; return this; }
        public Builder setComment(String comment) { this.comment = comment; return this; }
        public Builder setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; return this; }

        public Builder copy(Review review) {
            this.reviewId = review.reviewId;
            this.customer = review.customer;
            this.room = review.room;
            this.rating = review.rating;
            this.comment = review.comment;
            this.createdAt = review.createdAt;
            return this;
        }

        public Review build() { return new Review(this); }
    }
}
