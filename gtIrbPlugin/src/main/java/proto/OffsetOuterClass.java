// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Offset.proto

package proto;

public final class OffsetOuterClass {
  private OffsetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OffsetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.Offset)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes element_id = 1;</code>
     */
    com.google.protobuf.ByteString getElementId();

    /**
     * <code>optional uint64 displacement = 2;</code>
     */
    long getDisplacement();
  }
  /**
   * Protobuf type {@code proto.Offset}
   */
  public  static final class Offset extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.Offset)
      OffsetOrBuilder {
    // Use Offset.newBuilder() to construct.
    private Offset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Offset() {
      elementId_ = com.google.protobuf.ByteString.EMPTY;
      displacement_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Offset(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              elementId_ = input.readBytes();
              break;
            }
            case 16: {

              displacement_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.OffsetOuterClass.internal_static_proto_Offset_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.OffsetOuterClass.internal_static_proto_Offset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.OffsetOuterClass.Offset.class, proto.OffsetOuterClass.Offset.Builder.class);
    }

    public static final int ELEMENT_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString elementId_;
    /**
     * <code>optional bytes element_id = 1;</code>
     */
    public com.google.protobuf.ByteString getElementId() {
      return elementId_;
    }

    public static final int DISPLACEMENT_FIELD_NUMBER = 2;
    private long displacement_;
    /**
     * <code>optional uint64 displacement = 2;</code>
     */
    public long getDisplacement() {
      return displacement_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!elementId_.isEmpty()) {
        output.writeBytes(1, elementId_);
      }
      if (displacement_ != 0L) {
        output.writeUInt64(2, displacement_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!elementId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, elementId_);
      }
      if (displacement_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, displacement_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof proto.OffsetOuterClass.Offset)) {
        return super.equals(obj);
      }
      proto.OffsetOuterClass.Offset other = (proto.OffsetOuterClass.Offset) obj;

      boolean result = true;
      result = result && getElementId()
          .equals(other.getElementId());
      result = result && (getDisplacement()
          == other.getDisplacement());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ELEMENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getElementId().hashCode();
      hash = (37 * hash) + DISPLACEMENT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDisplacement());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.OffsetOuterClass.Offset parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.OffsetOuterClass.Offset parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.OffsetOuterClass.Offset parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.OffsetOuterClass.Offset parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(proto.OffsetOuterClass.Offset prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proto.Offset}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.Offset)
        proto.OffsetOuterClass.OffsetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.OffsetOuterClass.internal_static_proto_Offset_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.OffsetOuterClass.internal_static_proto_Offset_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.OffsetOuterClass.Offset.class, proto.OffsetOuterClass.Offset.Builder.class);
      }

      // Construct using proto.OffsetOuterClass.Offset.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        elementId_ = com.google.protobuf.ByteString.EMPTY;

        displacement_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.OffsetOuterClass.internal_static_proto_Offset_descriptor;
      }

      public proto.OffsetOuterClass.Offset getDefaultInstanceForType() {
        return proto.OffsetOuterClass.Offset.getDefaultInstance();
      }

      public proto.OffsetOuterClass.Offset build() {
        proto.OffsetOuterClass.Offset result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public proto.OffsetOuterClass.Offset buildPartial() {
        proto.OffsetOuterClass.Offset result = new proto.OffsetOuterClass.Offset(this);
        result.elementId_ = elementId_;
        result.displacement_ = displacement_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.OffsetOuterClass.Offset) {
          return mergeFrom((proto.OffsetOuterClass.Offset)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.OffsetOuterClass.Offset other) {
        if (other == proto.OffsetOuterClass.Offset.getDefaultInstance()) return this;
        if (other.getElementId() != com.google.protobuf.ByteString.EMPTY) {
          setElementId(other.getElementId());
        }
        if (other.getDisplacement() != 0L) {
          setDisplacement(other.getDisplacement());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.OffsetOuterClass.Offset parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.OffsetOuterClass.Offset) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString elementId_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes element_id = 1;</code>
       */
      public com.google.protobuf.ByteString getElementId() {
        return elementId_;
      }
      /**
       * <code>optional bytes element_id = 1;</code>
       */
      public Builder setElementId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        elementId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes element_id = 1;</code>
       */
      public Builder clearElementId() {
        
        elementId_ = getDefaultInstance().getElementId();
        onChanged();
        return this;
      }

      private long displacement_ ;
      /**
       * <code>optional uint64 displacement = 2;</code>
       */
      public long getDisplacement() {
        return displacement_;
      }
      /**
       * <code>optional uint64 displacement = 2;</code>
       */
      public Builder setDisplacement(long value) {
        
        displacement_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 displacement = 2;</code>
       */
      public Builder clearDisplacement() {
        
        displacement_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.Offset)
    }

    // @@protoc_insertion_point(class_scope:proto.Offset)
    private static final proto.OffsetOuterClass.Offset DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.OffsetOuterClass.Offset();
    }

    public static proto.OffsetOuterClass.Offset getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Offset>
        PARSER = new com.google.protobuf.AbstractParser<Offset>() {
      public Offset parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Offset(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Offset> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Offset> getParserForType() {
      return PARSER;
    }

    public proto.OffsetOuterClass.Offset getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Offset_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Offset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Offset.proto\022\005proto\"2\n\006Offset\022\022\n\neleme" +
      "nt_id\030\001 \001(\014\022\024\n\014displacement\030\002 \001(\004b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_Offset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Offset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Offset_descriptor,
        new java.lang.String[] { "ElementId", "Displacement", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
