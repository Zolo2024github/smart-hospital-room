package ds.service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: medication_dispensing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MedicationDispensingServiceGrpc {

  private MedicationDispensingServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.service3.MedicationDispensingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service3.MedicationDispensing.DispenseRequest,
      ds.service3.MedicationDispensing.DispensingStatus> getDispenseMedicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DispenseMedication",
      requestType = ds.service3.MedicationDispensing.DispenseRequest.class,
      responseType = ds.service3.MedicationDispensing.DispensingStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.MedicationDispensing.DispenseRequest,
      ds.service3.MedicationDispensing.DispensingStatus> getDispenseMedicationMethod() {
    io.grpc.MethodDescriptor<ds.service3.MedicationDispensing.DispenseRequest, ds.service3.MedicationDispensing.DispensingStatus> getDispenseMedicationMethod;
    if ((getDispenseMedicationMethod = MedicationDispensingServiceGrpc.getDispenseMedicationMethod) == null) {
      synchronized (MedicationDispensingServiceGrpc.class) {
        if ((getDispenseMedicationMethod = MedicationDispensingServiceGrpc.getDispenseMedicationMethod) == null) {
          MedicationDispensingServiceGrpc.getDispenseMedicationMethod = getDispenseMedicationMethod =
              io.grpc.MethodDescriptor.<ds.service3.MedicationDispensing.DispenseRequest, ds.service3.MedicationDispensing.DispensingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DispenseMedication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.MedicationDispensing.DispenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.MedicationDispensing.DispensingStatus.getDefaultInstance()))
              .setSchemaDescriptor(new MedicationDispensingServiceMethodDescriptorSupplier("DispenseMedication"))
              .build();
        }
      }
    }
    return getDispenseMedicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.MedicationDispensing.MedicationRequest,
      ds.service3.MedicationDispensing.StockLevel> getCheckMedicationStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMedicationStock",
      requestType = ds.service3.MedicationDispensing.MedicationRequest.class,
      responseType = ds.service3.MedicationDispensing.StockLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.MedicationDispensing.MedicationRequest,
      ds.service3.MedicationDispensing.StockLevel> getCheckMedicationStockMethod() {
    io.grpc.MethodDescriptor<ds.service3.MedicationDispensing.MedicationRequest, ds.service3.MedicationDispensing.StockLevel> getCheckMedicationStockMethod;
    if ((getCheckMedicationStockMethod = MedicationDispensingServiceGrpc.getCheckMedicationStockMethod) == null) {
      synchronized (MedicationDispensingServiceGrpc.class) {
        if ((getCheckMedicationStockMethod = MedicationDispensingServiceGrpc.getCheckMedicationStockMethod) == null) {
          MedicationDispensingServiceGrpc.getCheckMedicationStockMethod = getCheckMedicationStockMethod =
              io.grpc.MethodDescriptor.<ds.service3.MedicationDispensing.MedicationRequest, ds.service3.MedicationDispensing.StockLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckMedicationStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.MedicationDispensing.MedicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.MedicationDispensing.StockLevel.getDefaultInstance()))
              .setSchemaDescriptor(new MedicationDispensingServiceMethodDescriptorSupplier("CheckMedicationStock"))
              .build();
        }
      }
    }
    return getCheckMedicationStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MedicationDispensingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MedicationDispensingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MedicationDispensingServiceStub>() {
        @java.lang.Override
        public MedicationDispensingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MedicationDispensingServiceStub(channel, callOptions);
        }
      };
    return MedicationDispensingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MedicationDispensingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MedicationDispensingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MedicationDispensingServiceBlockingStub>() {
        @java.lang.Override
        public MedicationDispensingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MedicationDispensingServiceBlockingStub(channel, callOptions);
        }
      };
    return MedicationDispensingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MedicationDispensingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MedicationDispensingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MedicationDispensingServiceFutureStub>() {
        @java.lang.Override
        public MedicationDispensingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MedicationDispensingServiceFutureStub(channel, callOptions);
        }
      };
    return MedicationDispensingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MedicationDispensingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void dispenseMedication(ds.service3.MedicationDispensing.DispenseRequest request,
        io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.DispensingStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDispenseMedicationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.MedicationRequest> checkMedicationStock(
        io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.StockLevel> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCheckMedicationStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDispenseMedicationMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ds.service3.MedicationDispensing.DispenseRequest,
                ds.service3.MedicationDispensing.DispensingStatus>(
                  this, METHODID_DISPENSE_MEDICATION)))
          .addMethod(
            getCheckMedicationStockMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service3.MedicationDispensing.MedicationRequest,
                ds.service3.MedicationDispensing.StockLevel>(
                  this, METHODID_CHECK_MEDICATION_STOCK)))
          .build();
    }
  }

  /**
   */
  public static final class MedicationDispensingServiceStub extends io.grpc.stub.AbstractAsyncStub<MedicationDispensingServiceStub> {
    private MedicationDispensingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicationDispensingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MedicationDispensingServiceStub(channel, callOptions);
    }

    /**
     */
    public void dispenseMedication(ds.service3.MedicationDispensing.DispenseRequest request,
        io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.DispensingStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDispenseMedicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.MedicationRequest> checkMedicationStock(
        io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.StockLevel> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCheckMedicationStockMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MedicationDispensingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MedicationDispensingServiceBlockingStub> {
    private MedicationDispensingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicationDispensingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MedicationDispensingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.service3.MedicationDispensing.DispensingStatus> dispenseMedication(
        ds.service3.MedicationDispensing.DispenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDispenseMedicationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MedicationDispensingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MedicationDispensingServiceFutureStub> {
    private MedicationDispensingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicationDispensingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MedicationDispensingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DISPENSE_MEDICATION = 0;
  private static final int METHODID_CHECK_MEDICATION_STOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MedicationDispensingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MedicationDispensingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISPENSE_MEDICATION:
          serviceImpl.dispenseMedication((ds.service3.MedicationDispensing.DispenseRequest) request,
              (io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.DispensingStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_MEDICATION_STOCK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkMedicationStock(
              (io.grpc.stub.StreamObserver<ds.service3.MedicationDispensing.StockLevel>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MedicationDispensingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MedicationDispensingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service3.MedicationDispensing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MedicationDispensingService");
    }
  }

  private static final class MedicationDispensingServiceFileDescriptorSupplier
      extends MedicationDispensingServiceBaseDescriptorSupplier {
    MedicationDispensingServiceFileDescriptorSupplier() {}
  }

  private static final class MedicationDispensingServiceMethodDescriptorSupplier
      extends MedicationDispensingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MedicationDispensingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MedicationDispensingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MedicationDispensingServiceFileDescriptorSupplier())
              .addMethod(getDispenseMedicationMethod())
              .addMethod(getCheckMedicationStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
