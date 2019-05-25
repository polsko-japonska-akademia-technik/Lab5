//Aleksander Mojzych s15595 i Adrian Matyszczak s19850
//cel: ChemicalElements
public class ChemicalElement
{
private String symbol = "";
private int atomicNumber = 1;
private double electronegativity;
public static final ChemicalElement HYDROGEN = new ChemicalElement("H", 1, 2.20);
public static final ChemicalElement OXYGEN = new ChemicalElement("O", 8, 3.44);
public static final ChemicalElement POTASSIUM = new ChemicalElement("K", 19, 0.82);
public static final ChemicalElement ZINC = new ChemicalElement("Zn", 30, 1.65);
public static final ChemicalElement GALLIUM = new ChemicalElement("Ga", 31, 1.81);
private static boolean [] alkaliMetal = new boolean[119];
static
{
alkaliMetal[3] = true;
alkaliMetal[11] = true;
alkaliMetal[19] = true;
alkaliMetal[37] = true;
alkaliMetal[55] = true;
alkaliMetal[85] = true;
}
public ChemicalElement(String symbol, int atomicNumber, double electronegativity)
{
    this.symbol = symbol;
    this.atomicNumber = atomicNumber;
    this.electronegativity = electronegativity;
}
public ChemicalElement (String symbol, int electronegativity)
{
    this(symbol, electronegativity, 0);
}
public boolean isMetal()
{
    boolean metal = false;
    switch (atomicNumber) {
        case 13:
        case 31:
        case 49:
        case 50:
        case 81:
        case 82:
        case 83:
        case 113:
        case 114:
        case 115:
        case 116:
            metal = true;
    }
    return metal;

}
    public boolean isAlkaliMetal()
    {
        return alkaliMetal[atomicNumber];
    }
    public boolean isTransitionMetal()
    {
        return 21 <= atomicNumber && atomicNumber <= 30
        || 39 <= atomicNumber && atomicNumber <= 48
        || 72 <= atomicNumber && atomicNumber <= 80;
    }
    public String getSymbol()
    {
        return symbol;
    }
    public int getAtomicNumber()
    {
    return atomicNumber;
    }
    public double getElectronegativity()
    {
    return electronegativity;
    }
    public String toString()
    {
    return getSymbol();
    }
    public int compareTo(Object o)
    {
    ChemicalElement element = (ChemicalElement);
    }
    if ( Math.abs(electronegativity - element.electronegativity) <= 0.000000000001) {
    return 0;
    } else if ( electronegativity < element.electronegativity) {
    return -1;
    } else {
    return 1;
    }
}

