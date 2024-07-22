package com.Lubee.Lubee.location.domain;

import com.Lubee.Lubee.enumset.Category;
import com.Lubee.Lubee.enumset.Spot;
import com.Lubee.Lubee.memory.domain.Memory;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.geo.Point;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long location_id;

    private Point coordinate;

    private Spot spot;

    private String picture;

    private String name;

    private String parcelBaseAddress;

    private Category category;

    private int count;

    @OneToMany(mappedBy = "location")
    private List<Memory> memories;
}