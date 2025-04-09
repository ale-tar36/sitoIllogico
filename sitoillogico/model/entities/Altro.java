package org.example.sitoillogico.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Altro
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long e;
	private String f;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_qualcosa")
	private Qualcosa qualcosa;
}
