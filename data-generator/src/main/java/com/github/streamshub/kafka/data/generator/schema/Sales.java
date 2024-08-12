/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.github.streamshub.kafka.data.generator.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Sales extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2977823418513823295L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Sales\",\"namespace\":\"com.github.streamshub.kafka.data.generator.schema\",\"fields\":[{\"name\":\"user_id\",\"type\":\"string\"},{\"name\":\"product_id\",\"type\":\"string\"},{\"name\":\"invoice_id\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"string\"},{\"name\":\"unit_cost\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence user_id;
  @Deprecated public java.lang.CharSequence product_id;
  @Deprecated public java.lang.CharSequence invoice_id;
  @Deprecated public java.lang.CharSequence quantity;
  @Deprecated public java.lang.CharSequence unit_cost;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Sales() {}

  /**
   * All-args constructor.
   * @param user_id The new value for user_id
   * @param product_id The new value for product_id
   * @param invoice_id The new value for invoice_id
   * @param quantity The new value for quantity
   * @param unit_cost The new value for unit_cost
   */
  public Sales(java.lang.CharSequence user_id, java.lang.CharSequence product_id, java.lang.CharSequence invoice_id, java.lang.CharSequence quantity, java.lang.CharSequence unit_cost) {
    this.user_id = user_id;
    this.product_id = product_id;
    this.invoice_id = invoice_id;
    this.quantity = quantity;
    this.unit_cost = unit_cost;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return user_id;
    case 1: return product_id;
    case 2: return invoice_id;
    case 3: return quantity;
    case 4: return unit_cost;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: user_id = (java.lang.CharSequence)value$; break;
    case 1: product_id = (java.lang.CharSequence)value$; break;
    case 2: invoice_id = (java.lang.CharSequence)value$; break;
    case 3: quantity = (java.lang.CharSequence)value$; break;
    case 4: unit_cost = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'user_id' field.
   * @return The value of the 'user_id' field.
   */
  public java.lang.CharSequence getUserId() {
    return user_id;
  }

  /**
   * Sets the value of the 'user_id' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.CharSequence value) {
    this.user_id = value;
  }

  /**
   * Gets the value of the 'product_id' field.
   * @return The value of the 'product_id' field.
   */
  public java.lang.CharSequence getProductId() {
    return product_id;
  }

  /**
   * Sets the value of the 'product_id' field.
   * @param value the value to set.
   */
  public void setProductId(java.lang.CharSequence value) {
    this.product_id = value;
  }

  /**
   * Gets the value of the 'invoice_id' field.
   * @return The value of the 'invoice_id' field.
   */
  public java.lang.CharSequence getInvoiceId() {
    return invoice_id;
  }

  /**
   * Sets the value of the 'invoice_id' field.
   * @param value the value to set.
   */
  public void setInvoiceId(java.lang.CharSequence value) {
    this.invoice_id = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.CharSequence getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.CharSequence value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'unit_cost' field.
   * @return The value of the 'unit_cost' field.
   */
  public java.lang.CharSequence getUnitCost() {
    return unit_cost;
  }

  /**
   * Sets the value of the 'unit_cost' field.
   * @param value the value to set.
   */
  public void setUnitCost(java.lang.CharSequence value) {
    this.unit_cost = value;
  }

  /**
   * Creates a new Sales RecordBuilder.
   * @return A new Sales RecordBuilder
   */
  public static com.github.streamshub.kafka.data.generator.schema.Sales.Builder newBuilder() {
    return new com.github.streamshub.kafka.data.generator.schema.Sales.Builder();
  }

  /**
   * Creates a new Sales RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Sales RecordBuilder
   */
  public static com.github.streamshub.kafka.data.generator.schema.Sales.Builder newBuilder(com.github.streamshub.kafka.data.generator.schema.Sales.Builder other) {
    return new com.github.streamshub.kafka.data.generator.schema.Sales.Builder(other);
  }

  /**
   * Creates a new Sales RecordBuilder by copying an existing Sales instance.
   * @param other The existing instance to copy.
   * @return A new Sales RecordBuilder
   */
  public static com.github.streamshub.kafka.data.generator.schema.Sales.Builder newBuilder(com.github.streamshub.kafka.data.generator.schema.Sales other) {
    return new com.github.streamshub.kafka.data.generator.schema.Sales.Builder(other);
  }

  /**
   * RecordBuilder for Sales instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Sales>
    implements org.apache.avro.data.RecordBuilder<Sales> {

    private java.lang.CharSequence user_id;
    private java.lang.CharSequence product_id;
    private java.lang.CharSequence invoice_id;
    private java.lang.CharSequence quantity;
    private java.lang.CharSequence unit_cost;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.github.streamshub.kafka.data.generator.schema.Sales.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.user_id)) {
        this.user_id = data().deepCopy(fields()[0].schema(), other.user_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_id)) {
        this.product_id = data().deepCopy(fields()[1].schema(), other.product_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.invoice_id)) {
        this.invoice_id = data().deepCopy(fields()[2].schema(), other.invoice_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.unit_cost)) {
        this.unit_cost = data().deepCopy(fields()[4].schema(), other.unit_cost);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Sales instance
     * @param other The existing instance to copy.
     */
    private Builder(com.github.streamshub.kafka.data.generator.schema.Sales other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.user_id)) {
        this.user_id = data().deepCopy(fields()[0].schema(), other.user_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_id)) {
        this.product_id = data().deepCopy(fields()[1].schema(), other.product_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.invoice_id)) {
        this.invoice_id = data().deepCopy(fields()[2].schema(), other.invoice_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.unit_cost)) {
        this.unit_cost = data().deepCopy(fields()[4].schema(), other.unit_cost);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'user_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserId() {
      return user_id;
    }

    /**
      * Sets the value of the 'user_id' field.
      * @param value The value of 'user_id'.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.user_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'user_id' field has been set.
      * @return True if the 'user_id' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'user_id' field.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder clearUserId() {
      user_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'product_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getProductId() {
      return product_id;
    }

    /**
      * Sets the value of the 'product_id' field.
      * @param value The value of 'product_id'.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder setProductId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.product_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'product_id' field has been set.
      * @return True if the 'product_id' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'product_id' field.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder clearProductId() {
      product_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'invoice_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getInvoiceId() {
      return invoice_id;
    }

    /**
      * Sets the value of the 'invoice_id' field.
      * @param value The value of 'invoice_id'.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder setInvoiceId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.invoice_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'invoice_id' field has been set.
      * @return True if the 'invoice_id' field has been set, false otherwise.
      */
    public boolean hasInvoiceId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'invoice_id' field.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder clearInvoiceId() {
      invoice_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.CharSequence getQuantity() {
      return quantity;
    }

    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder setQuantity(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.quantity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder clearQuantity() {
      quantity = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'unit_cost' field.
      * @return The value.
      */
    public java.lang.CharSequence getUnitCost() {
      return unit_cost;
    }

    /**
      * Sets the value of the 'unit_cost' field.
      * @param value The value of 'unit_cost'.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder setUnitCost(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.unit_cost = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'unit_cost' field has been set.
      * @return True if the 'unit_cost' field has been set, false otherwise.
      */
    public boolean hasUnitCost() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'unit_cost' field.
      * @return This builder.
      */
    public com.github.streamshub.kafka.data.generator.schema.Sales.Builder clearUnitCost() {
      unit_cost = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Sales build() {
      try {
        Sales record = new Sales();
        record.user_id = fieldSetFlags()[0] ? this.user_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.product_id = fieldSetFlags()[1] ? this.product_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.invoice_id = fieldSetFlags()[2] ? this.invoice_id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.quantity = fieldSetFlags()[3] ? this.quantity : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.unit_cost = fieldSetFlags()[4] ? this.unit_cost : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
