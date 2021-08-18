package com.cpe.backend.Addjob.entity;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Entity
@NoArgsConstructor
@Table(name="Information")
public class Information {
    @Id    
    @SequenceGenerator(name="Information_SEQ",sequenceName="Information_SEQ")               
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Information_SEQ")

    @Column(name="Information_id",unique = true, nullable = true)
    private @NonNull Long id;
    
    @NotNull
    @Size(min=4, max=30)
    @Pattern(regexp = "[a-zA-Z]{1,50}$")
    @Column(name="Information_type")
    private String Information_type;

	public void setName(String name){
        this.Information_type=name;
    }
    
}