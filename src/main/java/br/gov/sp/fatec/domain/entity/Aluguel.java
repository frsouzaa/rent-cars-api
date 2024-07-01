package br.gov.sp.fatec.domain.entity;

import br.gov.sp.fatec.domain.enums.AluguelStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Aluguel {

    @Id
    @GeneratedValue
    private Long id;

    private Date dataInicio;

    private Date dataFim;

    private double valor;

    @Enumerated(value = EnumType.STRING)
    private AluguelStatus status;

    @OneToOne
    private Carro carro;

    @OneToOne
    private Cliente cliente;
}
