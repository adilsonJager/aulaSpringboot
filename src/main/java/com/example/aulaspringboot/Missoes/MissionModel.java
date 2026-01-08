package com.example.aulaspringboot.Missoes;

import com.example.aulaspringboot.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String level;
    private String location;
    private boolean status;

    //uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninja;



}
