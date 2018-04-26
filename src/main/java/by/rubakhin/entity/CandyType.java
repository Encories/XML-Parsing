package by.rubakhin.entity;

import javax.xml.bind.annotation.XmlEnumValue;

public enum CandyType {

    @XmlEnumValue(value = "Lollipop")
    LOLLIPOP,

    @XmlEnumValue(value = "ChupaChups")
    CHUPACHUPS,

    @XmlEnumValue(value = "Chocolate with filling")
    CHOCOLATE_WITH_FILLING,

    @XmlEnumValue(value = "Chocolate without filling")
    CHOCOLATE_WITHOUT_FILLING
}
