package de.cgi.lr.elide.model;

import com.yahoo.elide.annotation.Include;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Include(name = "dataspaces")
@Entity
@Table(name = "dataspaces")
@Data
public class Dataspace
{

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1024)
    private String description = "";

}
