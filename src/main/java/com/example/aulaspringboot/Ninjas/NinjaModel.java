package com.example.aulaspringboot.Ninjas;

import com.example.aulaspringboot.Missoes.MissionModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name= "tb_register")
@NoArgsConstructor
@AllArgsConstructor
@Data // create gets and setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int idade;


    @ManyToOne
    @JoinColumn(name = "mission_id") //foreing key
    private MissionModel mission;


}
