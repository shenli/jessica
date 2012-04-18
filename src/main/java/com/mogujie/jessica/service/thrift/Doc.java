/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.mogujie.jessica.service.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doc implements org.apache.thrift.TBase<Doc, Doc._Fields>, java.io.Serializable, Cloneable
{
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Doc");

    private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I64, (short) 1);
    private static final org.apache.thrift.protocol.TField FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fields", org.apache.thrift.protocol.TType.MAP, (short) 2);

    public long uid; // required
    public Map<String, String> fields; // required

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum
    {
        UID((short) 1, "uid"), FIELDS((short) 2, "fields");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static
        {
            for (_Fields field : EnumSet.allOf(_Fields.class))
            {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId)
        {
            switch (fieldId)
            {
            case 1: // UID
                return UID;
            case 2: // FIELDS
                return FIELDS;
            default:
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId)
        {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name)
        {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName)
        {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId()
        {
            return _thriftId;
        }

        public String getFieldName()
        {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __UID_ISSET_ID = 0;
    private BitSet __isset_bit_vector = new BitSet(1);

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static
    {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.REQUIRED, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.FIELDS, new org.apache.thrift.meta_data.FieldMetaData("fields", org.apache.thrift.TFieldRequirementType.REQUIRED, new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Doc.class, metaDataMap);
    }

    public Doc()
    {
    }

    public Doc(long uid, Map<String, String> fields)
    {
        this();
        this.uid = uid;
        setUidIsSet(true);
        this.fields = fields;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Doc(Doc other)
    {
        __isset_bit_vector.clear();
        __isset_bit_vector.or(other.__isset_bit_vector);
        this.uid = other.uid;
        if (other.isSetFields())
        {
            Map<String, String> __this__fields = new HashMap<String, String>();
            for (Map.Entry<String, String> other_element : other.fields.entrySet())
            {

                String other_element_key = other_element.getKey();
                String other_element_value = other_element.getValue();

                String __this__fields_copy_key = other_element_key;

                String __this__fields_copy_value = other_element_value;

                __this__fields.put(__this__fields_copy_key, __this__fields_copy_value);
            }
            this.fields = __this__fields;
        }
    }

    public Doc deepCopy()
    {
        return new Doc(this);
    }

    @Override
    public void clear()
    {
        setUidIsSet(false);
        this.uid = 0;
        this.fields = null;
    }

    public long getUid()
    {
        return this.uid;
    }

    public Doc setUid(long uid)
    {
        this.uid = uid;
        setUidIsSet(true);
        return this;
    }

    public void unsetUid()
    {
        __isset_bit_vector.clear(__UID_ISSET_ID);
    }

    /**
     * Returns true if field uid is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetUid()
    {
        return __isset_bit_vector.get(__UID_ISSET_ID);
    }

    public void setUidIsSet(boolean value)
    {
        __isset_bit_vector.set(__UID_ISSET_ID, value);
    }

    public int getFieldsSize()
    {
        return (this.fields == null) ? 0 : this.fields.size();
    }

    public void putToFields(String key, String val)
    {
        if (this.fields == null)
        {
            this.fields = new HashMap<String, String>();
        }
        this.fields.put(key, val);
    }

    public Map<String, String> getFields()
    {
        return this.fields;
    }

    public Doc setFields(Map<String, String> fields)
    {
        this.fields = fields;
        return this;
    }

    public void unsetFields()
    {
        this.fields = null;
    }

    /**
     * Returns true if field fields is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetFields()
    {
        return this.fields != null;
    }

    public void setFieldsIsSet(boolean value)
    {
        if (!value)
        {
            this.fields = null;
        }
    }

    public void setFieldValue(_Fields field, Object value)
    {
        switch (field)
        {
        case UID:
            if (value == null)
            {
                unsetUid();
            } else
            {
                setUid((Long) value);
            }
            break;

        case FIELDS:
            if (value == null)
            {
                unsetFields();
            } else
            {
                setFields((Map<String, String>) value);
            }
            break;

        }
    }

    public Object getFieldValue(_Fields field)
    {
        switch (field)
        {
        case UID:
            return Long.valueOf(getUid());

        case FIELDS:
            return getFields();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    public boolean isSet(_Fields field)
    {
        if (field == null)
        {
            throw new IllegalArgumentException();
        }

        switch (field)
        {
        case UID:
            return isSetUid();
        case FIELDS:
            return isSetFields();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that)
    {
        if (that == null)
            return false;
        if (that instanceof Doc)
            return this.equals((Doc) that);
        return false;
    }

    public boolean equals(Doc that)
    {
        if (that == null)
            return false;

        boolean this_present_uid = true;
        boolean that_present_uid = true;
        if (this_present_uid || that_present_uid)
        {
            if (!(this_present_uid && that_present_uid))
                return false;
            if (this.uid != that.uid)
                return false;
        }

        boolean this_present_fields = true && this.isSetFields();
        boolean that_present_fields = true && that.isSetFields();
        if (this_present_fields || that_present_fields)
        {
            if (!(this_present_fields && that_present_fields))
                return false;
            if (!this.fields.equals(that.fields))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }

    public int compareTo(Doc other)
    {
        if (!getClass().equals(other.getClass()))
        {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        Doc typedOther = (Doc) other;

        lastComparison = Boolean.valueOf(isSetUid()).compareTo(typedOther.isSetUid());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetUid())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, typedOther.uid);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetFields()).compareTo(typedOther.isSetFields());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetFields())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fields, typedOther.fields);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId)
    {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException
    {
        org.apache.thrift.protocol.TField field;
        iprot.readStructBegin();
        while (true)
        {
            field = iprot.readFieldBegin();
            if (field.type == org.apache.thrift.protocol.TType.STOP)
            {
                break;
            }
            switch (field.id)
            {
            case 1: // UID
                if (field.type == org.apache.thrift.protocol.TType.I64)
                {
                    this.uid = iprot.readI64();
                    setUidIsSet(true);
                } else
                {
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                }
                break;
            case 2: // FIELDS
                if (field.type == org.apache.thrift.protocol.TType.MAP)
                {
                    {
                        org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                        this.fields = new HashMap<String, String>(2 * _map4.size);
                        for (int _i5 = 0; _i5 < _map4.size; ++_i5)
                        {
                            String _key6; // required
                            String _val7; // required
                            _key6 = iprot.readString();
                            _val7 = iprot.readString();
                            this.fields.put(_key6, _val7);
                        }
                        iprot.readMapEnd();
                    }
                } else
                {
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                }
                break;
            default:
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked
        // in the validate method
        if (!isSetUid())
        {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'uid' was not found in serialized data! Struct: " + toString());
        }
        validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException
    {
        validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeI64(this.uid);
        oprot.writeFieldEnd();
        if (this.fields != null)
        {
            oprot.writeFieldBegin(FIELDS_FIELD_DESC);
            {
                oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.fields.size()));
                for (Map.Entry<String, String> _iter8 : this.fields.entrySet())
                {
                    oprot.writeString(_iter8.getKey());
                    oprot.writeString(_iter8.getValue());
                }
                oprot.writeMapEnd();
            }
            oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("Doc(");
        boolean first = true;

        sb.append("uid:");
        sb.append(this.uid);
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("fields:");
        if (this.fields == null)
        {
            sb.append("null");
        } else
        {
            sb.append(this.fields);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException
    {
        // check for required fields
        // alas, we cannot check 'uid' because it's a primitive and you chose
        // the non-beans generator.
        if (fields == null)
        {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'fields' was not present! Struct: " + toString());
        }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        try
        {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te)
        {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException
    {
        try
        {
            // it doesn't seem like you should have to do this, but java
            // serialization is wacky, and doesn't call the default constructor.
            __isset_bit_vector = new BitSet(1);
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te)
        {
            throw new java.io.IOException(te);
        }
    }

}