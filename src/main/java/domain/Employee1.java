package domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "Employee", uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false, unique = true,length = 11)
    private int id;
    @Column(name = "NAME",length = 20,nullable = true)
    private String name;
    @Column(name = "ROLE",length = 20,nullable = true)
    private String role;
    @Column (name = "insert_time",nullable = false)
    private Date insertTime;

}
