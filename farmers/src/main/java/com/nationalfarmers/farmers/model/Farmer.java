package com.nationalfarmers.farmers.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Farmer {

    @Id
    @SequenceGenerator(
            name = "farmer_id_sequence",
            sequenceName = "farmer_id_sequence"
    )
    @GeneratedValue(
            generator = "farmer_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String firstName;
    private String lastName;
    private Long phoneNo;
    private String email;
    private String fullAddress;
}
