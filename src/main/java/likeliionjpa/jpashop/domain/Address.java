package likeliionjpa.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Embeddable // 다른 엔티티에서 종속되어 이용
public class Address {
    private String city;
    private String street;
    private String zipcode;
}