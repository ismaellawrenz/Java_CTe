
package br.com.swconsultoria.cte.schema_400.procGTVe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GTVe" type="{http://www.portalfiscal.inf.br/cte}TGTVe"/>
 *         &lt;element name="protCTe" type="{http://www.portalfiscal.inf.br/cte}TProtGTVe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" />
 *       &lt;attribute name="nPortaCon">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dhConexao" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gtVe",
    "protCTe"
})
@XmlRootElement(name = "GTVeProc", namespace = "http://www.portalfiscal.inf.br/cte")
public class GTVeProc {

    @XmlElement(name = "GTVe", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected TGTVe gtVe;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected TProtGTVe protCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;
    @XmlAttribute(name = "nPortaCon")
    protected String nPortaCon;
    @XmlAttribute(name = "dhConexao")
    protected String dhConexao;

    /**
     * Obtém o valor da propriedade gtVe.
     * 
     * @return
     *     possible object is
     *     {@link TGTVe }
     *     
     */
    public TGTVe getGTVe() {
        return gtVe;
    }

    /**
     * Define o valor da propriedade gtVe.
     * 
     * @param value
     *     allowed object is
     *     {@link TGTVe }
     *     
     */
    public void setGTVe(TGTVe value) {
        this.gtVe = value;
    }

    /**
     * Obtém o valor da propriedade protCTe.
     * 
     * @return
     *     possible object is
     *     {@link TProtGTVe }
     *     
     */
    public TProtGTVe getProtCTe() {
        return protCTe;
    }

    /**
     * Define o valor da propriedade protCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TProtGTVe }
     *     
     */
    public void setProtCTe(TProtGTVe value) {
        this.protCTe = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade ipTransmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

    /**
     * Obtém o valor da propriedade nPortaCon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPortaCon() {
        return nPortaCon;
    }

    /**
     * Define o valor da propriedade nPortaCon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPortaCon(String value) {
        this.nPortaCon = value;
    }

    /**
     * Obtém o valor da propriedade dhConexao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhConexao() {
        return dhConexao;
    }

    /**
     * Define o valor da propriedade dhConexao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhConexao(String value) {
        this.dhConexao = value;
    }

}
