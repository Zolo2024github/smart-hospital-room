package ds.generated.service1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: patient_monitoring.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PatientMonitoringServiceGrpc {

  private PatientMonitoringServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.service.PatientMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.generated.service1.PatientMonitoring.RequestMessage,
      ds.generated.service1.PatientMonitoring.ResponseMessage> getMonitorVitalSignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorVitalSigns",
      requestType = ds.generated.service1.PatientMonitoring.RequestMessage.class,
      responseType = ds.generated.service1.PatientMonitoring.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.generated.service1.PatientMonitoring.RequestMessage,
      ds.generated.service1.PatientMonitoring.ResponseMessage> getMonitorVitalSignsMethod() {
    io.grpc.MethodDescriptor<ds.generated.service1.PatientMonitoring.RequestMessage, ds.generated.service1.PatientMonitoring.ResponseMessage> getMonitorVitalSignsMethod;
    if ((getMonitorVitalSignsMethod = PatientMonitoringServiceGrpc.getMonitorVitalSignsMethod) == null) {
      synchronized (PatientMonitoringServiceGrpc.class) {
        if ((getMonitorVitalSignsMethod = PatientMonitoringServiceGrpc.getMonitorVitalSignsMethod) == null) {
          PatientMonitoringServiceGrpc.getMonitorVitalSignsMethod = getMonitorVitalSignsMethod =
              io.grpc.MethodDescriptor.<ds.generated.service1.PatientMonitoring.RequestMessage, ds.generated.service1.PatientMonitoring.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorVitalSigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.generated.service1.PatientMonitoring.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.generated.service1.PatientMonitoring.ResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PatientMonitoringServiceMethodDescriptorSupplier("MonitorVitalSigns"))
              .build();
        }
      }
    }
    return getMonitorVitalSignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.generated.service1.PatientMonitoring.AlertRequestMessage,
      ds.generated.service1.PatientMonitoring.AlertResponseMessage> getAlertNurseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlertNurse",
      requestType = ds.generated.service1.PatientMonitoring.AlertRequestMessage.class,
      responseType = ds.generated.service1.PatientMonitoring.AlertResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.generated.service1.PatientMonitoring.AlertRequestMessage,
      ds.generated.service1.PatientMonitoring.AlertResponseMessage> getAlertNurseMethod() {
    io.grpc.MethodDescriptor<ds.generated.service1.PatientMonitoring.AlertRequestMessage, ds.generated.service1.PatientMonitoring.AlertResponseMessage> getAlertNurseMethod;
    if ((getAlertNurseMethod = PatientMonitoringServiceGrpc.getAlertNurseMethod) == null) {
      synchronized (PatientMonitoringServiceGrpc.class) {
        if ((getAlertNurseMethod = PatientMonitoringServiceGrpc.getAlertNurseMethod) == null) {
          PatientMonitoringServiceGrpc.getAlertNurseMethod = getAlertNurseMethod =
              io.grpc.MethodDescriptor.<ds.generated.service1.PatientMonitoring.AlertRequestMessage, ds.generated.service1.PatientMonitoring.AlertResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlertNurse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.generated.service1.PatientMonitoring.AlertRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.generated.service1.PatientMonitoring.AlertResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PatientMonitoringServiceMethodDescriptorSupplier("AlertNurse"))
              .build();
        }
      }
    }
    return getAlertNurseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientMonitoringServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientMonitoringServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientMonitoringServiceStub>() {
        @java.lang.Override
        public PatientMonitoringServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientMonitoringServiceStub(channel, callOptions);
        }
      };
    return PatientMonitoringServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientMonitoringServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientMonitoringServiceBlockingStub>() {
        @java.lang.Override
        public PatientMonitoringServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientMonitoringServiceBlockingStub(channel, callOptions);
        }
      };
    return PatientMonitoringServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientMonitoringServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientMonitoringServiceFutureStub>() {
        @java.lang.Override
        public PatientMonitoringServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientMonitoringServiceFutureStub(channel, callOptions);
        }
      };
    return PatientMonitoringServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PatientMonitoringServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void monitorVitalSigns(ds.generated.service1.PatientMonitoring.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.generated.service1.PatientMonitoring.ResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMonitorVitalSignsMethod(), responseObserver);
    }

    /**
     */
    public void alertNurse(ds.generated.service1.PatientMonitoring.AlertRequestMessage request,
        io.grpc.stub.StreamObserver<ds.generated.service1.PatientMonitoring.AlertResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlertNurseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorVitalSignsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.generated.service1.PatientMonitoring.RequestMessage,
                ds.generated.service1.PatientMonitoring.ResponseMessage>(
                  this, METHODID_MONITOR_VITAL_SIGNS)))
          .addMethod(
            getAlertNurseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.generated.service1.PatientMonitoring.AlertRequestMessage,
                ds.generated.service1.PatientMonitoring.AlertResponseMessage>(
                  this, METHODID_ALERT_NURSE)))
          .build();
    }
  }

  /**
   */
  public static final class PatientMonitoringServiceStub extends io.grpc.stub.AbstractAsyncStub<PatientMonitoringServiceStub> {
    private PatientMonitoringServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientMonitoringServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientMonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void monitorVitalSigns(ds.generated.service1.PatientMonitoring.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.generated.service1.PatientMonitoring.ResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMonitorVitalSignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alertNurse(ds.generated.service1.PatientMonitoring.AlertRequestMessage request,
        io.grpc.stub.StreamObserver<ds.generated.service1.PatientMonitoring.AlertResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlertNurseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientMonitoringServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PatientMonitoringServiceBlockingStub> {
    private PatientMonitoringServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientMonitoringServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientMonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.generated.service1.PatientMonitoring.ResponseMessage monitorVitalSigns(ds.generated.service1.PatientMonitoring.RequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMonitorVitalSignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.generated.service1.PatientMonitoring.AlertResponseMessage alertNurse(ds.generated.service1.PatientMonitoring.AlertRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlertNurseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientMonitoringServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PatientMonitoringServiceFutureStub> {
    private PatientMonitoringServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientMonitoringServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientMonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.generated.service1.PatientMonitoring.ResponseMessage> monitorVitalSigns(
        ds.generated.service1.PatientMonitoring.RequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMonitorVitalSignsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.generated.service1.PatientMonitoring.AlertResponseMessage> alertNurse(
        ds.generated.service1.PatientMonitoring.AlertRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlertNurseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MONITOR_VITAL_SIGNS = 0;
  private static final int METHODID_ALERT_NURSE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientMonitoringServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientMonitoringServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_VITAL_SIGNS:
          serviceImpl.monitorVitalSigns((ds.generated.service1.PatientMonitoring.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.generated.service1.PatientMonitoring.ResponseMessage>) responseObserver);
          break;
        case METHODID_ALERT_NURSE:
          serviceImpl.alertNurse((ds.generated.service1.PatientMonitoring.AlertRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.generated.service1.PatientMonitoring.AlertResponseMessage>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PatientMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.generated.service1.PatientMonitoring.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientMonitoringService");
    }
  }

  private static final class PatientMonitoringServiceFileDescriptorSupplier
      extends PatientMonitoringServiceBaseDescriptorSupplier {
    PatientMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class PatientMonitoringServiceMethodDescriptorSupplier
      extends PatientMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientMonitoringServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientMonitoringServiceFileDescriptorSupplier())
              .addMethod(getMonitorVitalSignsMethod())
              .addMethod(getAlertNurseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
