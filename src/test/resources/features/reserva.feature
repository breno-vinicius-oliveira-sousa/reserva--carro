Feature: Reserva de carro

  Cenário: Reserva dentro da área de cobertura
    Dado que o passageiro está em "Belo Horizonte"
    Quando ele solicita um carro para o endereço "Praça da Liberdade"
    Então o sistema deve responder com "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que o passageiro está em "São Paulo"
    Quando ele solicita um carro para o endereço "Av. Paulista"
    Então o sistema deve responder com "Área fora de cobertura"
