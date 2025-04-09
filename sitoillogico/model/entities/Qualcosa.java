package org.example.sitoillogico.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.sitoillogico.model.enums.Enumeratore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Qualcosa
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long a;
	private String b;
	@Enumerated(EnumType.STRING)
	private Enumeratore c;
	private LocalDate d;

	@OneToMany(fetch = FetchType.EAGER)
	List<Altro> altri= new ArrayList<>();

}
