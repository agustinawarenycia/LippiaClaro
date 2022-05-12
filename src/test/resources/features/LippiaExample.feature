Feature: Lippia Example
  Como usuario quiero ver las promociones disponibles para mi linea

  @Example @Success
  Scenario Outline: Obtener promociones <tipo_bene1> <tipo_bene2> <tipo_bene3> con un monto medio de <monto>
    Given tengo una linea <bussinessType> y un profile <profileId>
    And ingreso un monto <monto> y una linea
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And obtengo las promociones para el monto <monto> y <beneficio1> <beneficio2> <beneficio3>

    Examples:
      | jsonName             | operation | entity    | bussinessType | profileId | monto | tipo_bene1 | beneficio1      | tipo_bene2 | beneficio2  | tipo_bene3 | beneficio3             |
      | promo_plus_con_promo | POST      | PROMOPLUS | CR            | 1257      | 500   | datos      | PACKS_DATA_PLUS | Voz        | PACKS_VOICE | dinero     | FUNDS_PROMOTIONAL_PLUS |

