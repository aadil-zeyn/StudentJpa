package com.UST.StudentJpa.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Institute {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;
    @ElementCollection
    private HashMap<String,Double> coursePrice;
}
