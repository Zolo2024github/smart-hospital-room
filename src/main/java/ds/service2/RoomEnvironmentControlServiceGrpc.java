package ds.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: room_environment_control.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RoomEnvironmentControlServiceGrpc {

  private RoomEnvironmentControlServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.service2.RoomEnvironmentControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service2.RoomEnvironmentControl.TemperatureSetting,
      ds.service2.RoomEnvironmentControl.StatusMessage> getAdjustTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustTemperature",
      requestType = ds.service2.RoomEnvironmentControl.TemperatureSetting.class,
      responseType = ds.service2.RoomEnvironmentControl.StatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.RoomEnvironmentControl.TemperatureSetting,
      ds.service2.RoomEnvironmentControl.StatusMessage> getAdjustTemperatureMethod() {
    io.grpc.MethodDescriptor<ds.service2.RoomEnvironmentControl.TemperatureSetting, ds.service2.RoomEnvironmentControl.StatusMessage> getAdjustTemperatureMethod;
    if ((getAdjustTemperatureMethod = RoomEnvironmentControlServiceGrpc.getAdjustTemperatureMethod) == null) {
      synchronized (RoomEnvironmentControlServiceGrpc.class) {
        if ((getAdjustTemperatureMethod = RoomEnvironmentControlServiceGrpc.getAdjustTemperatureMethod) == null) {
          RoomEnvironmentControlServiceGrpc.getAdjustTemperatureMethod = getAdjustTemperatureMethod =
              io.grpc.MethodDescriptor.<ds.service2.RoomEnvironmentControl.TemperatureSetting, ds.service2.RoomEnvironmentControl.StatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RoomEnvironmentControl.TemperatureSetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RoomEnvironmentControl.StatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RoomEnvironmentControlServiceMethodDescriptorSupplier("AdjustTemperature"))
              .build();
        }
      }
    }
    return getAdjustTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.RoomEnvironmentControl.LightCommand,
      ds.service2.RoomEnvironmentControl.StatusMessage> getControlLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlLights",
      requestType = ds.service2.RoomEnvironmentControl.LightCommand.class,
      responseType = ds.service2.RoomEnvironmentControl.StatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.RoomEnvironmentControl.LightCommand,
      ds.service2.RoomEnvironmentControl.StatusMessage> getControlLightsMethod() {
    io.grpc.MethodDescriptor<ds.service2.RoomEnvironmentControl.LightCommand, ds.service2.RoomEnvironmentControl.StatusMessage> getControlLightsMethod;
    if ((getControlLightsMethod = RoomEnvironmentControlServiceGrpc.getControlLightsMethod) == null) {
      synchronized (RoomEnvironmentControlServiceGrpc.class) {
        if ((getControlLightsMethod = RoomEnvironmentControlServiceGrpc.getControlLightsMethod) == null) {
          RoomEnvironmentControlServiceGrpc.getControlLightsMethod = getControlLightsMethod =
              io.grpc.MethodDescriptor.<ds.service2.RoomEnvironmentControl.LightCommand, ds.service2.RoomEnvironmentControl.StatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RoomEnvironmentControl.LightCommand.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RoomEnvironmentControl.StatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RoomEnvironmentControlServiceMethodDescriptorSupplier("ControlLights"))
              .build();
        }
      }
    }
    return getControlLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoomEnvironmentControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomEnvironmentControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomEnvironmentControlServiceStub>() {
        @java.lang.Override
        public RoomEnvironmentControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomEnvironmentControlServiceStub(channel, callOptions);
        }
      };
    return RoomEnvironmentControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoomEnvironmentControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomEnvironmentControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomEnvironmentControlServiceBlockingStub>() {
        @java.lang.Override
        public RoomEnvironmentControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomEnvironmentControlServiceBlockingStub(channel, callOptions);
        }
      };
    return RoomEnvironmentControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoomEnvironmentControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomEnvironmentControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomEnvironmentControlServiceFutureStub>() {
        @java.lang.Override
        public RoomEnvironmentControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomEnvironmentControlServiceFutureStub(channel, callOptions);
        }
      };
    return RoomEnvironmentControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RoomEnvironmentControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.TemperatureSetting> adjustTemperature(
        io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.StatusMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdjustTemperatureMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.LightCommand> controlLights(
        io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.StatusMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getControlLightsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdjustTemperatureMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                ds.service2.RoomEnvironmentControl.TemperatureSetting,
                ds.service2.RoomEnvironmentControl.StatusMessage>(
                  this, METHODID_ADJUST_TEMPERATURE)))
          .addMethod(
            getControlLightsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                ds.service2.RoomEnvironmentControl.LightCommand,
                ds.service2.RoomEnvironmentControl.StatusMessage>(
                  this, METHODID_CONTROL_LIGHTS)))
          .build();
    }
  }

  /**
   */
  public static final class RoomEnvironmentControlServiceStub extends io.grpc.stub.AbstractAsyncStub<RoomEnvironmentControlServiceStub> {
    private RoomEnvironmentControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomEnvironmentControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomEnvironmentControlServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.TemperatureSetting> adjustTemperature(
        io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.StatusMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.LightCommand> controlLights(
        io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.StatusMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getControlLightsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RoomEnvironmentControlServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoomEnvironmentControlServiceBlockingStub> {
    private RoomEnvironmentControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomEnvironmentControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomEnvironmentControlServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RoomEnvironmentControlServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoomEnvironmentControlServiceFutureStub> {
    private RoomEnvironmentControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomEnvironmentControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomEnvironmentControlServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ADJUST_TEMPERATURE = 0;
  private static final int METHODID_CONTROL_LIGHTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoomEnvironmentControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoomEnvironmentControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADJUST_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustTemperature(
              (io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.StatusMessage>) responseObserver);
        case METHODID_CONTROL_LIGHTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlLights(
              (io.grpc.stub.StreamObserver<ds.service2.RoomEnvironmentControl.StatusMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RoomEnvironmentControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoomEnvironmentControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.RoomEnvironmentControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoomEnvironmentControlService");
    }
  }

  private static final class RoomEnvironmentControlServiceFileDescriptorSupplier
      extends RoomEnvironmentControlServiceBaseDescriptorSupplier {
    RoomEnvironmentControlServiceFileDescriptorSupplier() {}
  }

  private static final class RoomEnvironmentControlServiceMethodDescriptorSupplier
      extends RoomEnvironmentControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoomEnvironmentControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoomEnvironmentControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoomEnvironmentControlServiceFileDescriptorSupplier())
              .addMethod(getAdjustTemperatureMethod())
              .addMethod(getControlLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
