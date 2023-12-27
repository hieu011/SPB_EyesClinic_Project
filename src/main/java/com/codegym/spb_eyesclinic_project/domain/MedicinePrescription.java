package com.codegym.spb_eyesclinic_project.domain;

import com.codegym.spb_eyesclinic_project.domain.Enum.EType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "medicine_prescription")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicinePrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Prescription prescription;

    @ManyToOne
    private Medicine medicine;

    private Long quantity;

    @Enumerated(EnumType.STRING)
    private EType type;

}
