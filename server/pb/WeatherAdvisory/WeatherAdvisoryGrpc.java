package WeatherAdvisory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.0)",
    comments = "Source: spec.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WeatherAdvisoryGrpc {

  private WeatherAdvisoryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "WeatherAdvisory.WeatherAdvisory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<WeatherAdvisory.Spec.AirQualityRequest,
      WeatherAdvisory.Spec.AirQualityResponse> getGetAirQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirQuality",
      requestType = WeatherAdvisory.Spec.AirQualityRequest.class,
      responseType = WeatherAdvisory.Spec.AirQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WeatherAdvisory.Spec.AirQualityRequest,
      WeatherAdvisory.Spec.AirQualityResponse> getGetAirQualityMethod() {
    io.grpc.MethodDescriptor<WeatherAdvisory.Spec.AirQualityRequest, WeatherAdvisory.Spec.AirQualityResponse> getGetAirQualityMethod;
    if ((getGetAirQualityMethod = WeatherAdvisoryGrpc.getGetAirQualityMethod) == null) {
      synchronized (WeatherAdvisoryGrpc.class) {
        if ((getGetAirQualityMethod = WeatherAdvisoryGrpc.getGetAirQualityMethod) == null) {
          WeatherAdvisoryGrpc.getGetAirQualityMethod = getGetAirQualityMethod =
              io.grpc.MethodDescriptor.<WeatherAdvisory.Spec.AirQualityRequest, WeatherAdvisory.Spec.AirQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAirQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WeatherAdvisory.Spec.AirQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WeatherAdvisory.Spec.AirQualityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherAdvisoryMethodDescriptorSupplier("GetAirQuality"))
              .build();
        }
      }
    }
    return getGetAirQualityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<WeatherAdvisory.Spec.WeatherRequest,
      WeatherAdvisory.Spec.WeatherResponse> getGetWeatherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWeather",
      requestType = WeatherAdvisory.Spec.WeatherRequest.class,
      responseType = WeatherAdvisory.Spec.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WeatherAdvisory.Spec.WeatherRequest,
      WeatherAdvisory.Spec.WeatherResponse> getGetWeatherMethod() {
    io.grpc.MethodDescriptor<WeatherAdvisory.Spec.WeatherRequest, WeatherAdvisory.Spec.WeatherResponse> getGetWeatherMethod;
    if ((getGetWeatherMethod = WeatherAdvisoryGrpc.getGetWeatherMethod) == null) {
      synchronized (WeatherAdvisoryGrpc.class) {
        if ((getGetWeatherMethod = WeatherAdvisoryGrpc.getGetWeatherMethod) == null) {
          WeatherAdvisoryGrpc.getGetWeatherMethod = getGetWeatherMethod =
              io.grpc.MethodDescriptor.<WeatherAdvisory.Spec.WeatherRequest, WeatherAdvisory.Spec.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWeather"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WeatherAdvisory.Spec.WeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WeatherAdvisory.Spec.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherAdvisoryMethodDescriptorSupplier("GetWeather"))
              .build();
        }
      }
    }
    return getGetWeatherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<WeatherAdvisory.Spec.TravelRequest,
      WeatherAdvisory.Spec.TravelRecommendationResponse> getGetTravelRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTravelRecommendation",
      requestType = WeatherAdvisory.Spec.TravelRequest.class,
      responseType = WeatherAdvisory.Spec.TravelRecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WeatherAdvisory.Spec.TravelRequest,
      WeatherAdvisory.Spec.TravelRecommendationResponse> getGetTravelRecommendationMethod() {
    io.grpc.MethodDescriptor<WeatherAdvisory.Spec.TravelRequest, WeatherAdvisory.Spec.TravelRecommendationResponse> getGetTravelRecommendationMethod;
    if ((getGetTravelRecommendationMethod = WeatherAdvisoryGrpc.getGetTravelRecommendationMethod) == null) {
      synchronized (WeatherAdvisoryGrpc.class) {
        if ((getGetTravelRecommendationMethod = WeatherAdvisoryGrpc.getGetTravelRecommendationMethod) == null) {
          WeatherAdvisoryGrpc.getGetTravelRecommendationMethod = getGetTravelRecommendationMethod =
              io.grpc.MethodDescriptor.<WeatherAdvisory.Spec.TravelRequest, WeatherAdvisory.Spec.TravelRecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTravelRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WeatherAdvisory.Spec.TravelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WeatherAdvisory.Spec.TravelRecommendationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherAdvisoryMethodDescriptorSupplier("GetTravelRecommendation"))
              .build();
        }
      }
    }
    return getGetTravelRecommendationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherAdvisoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherAdvisoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherAdvisoryStub>() {
        @java.lang.Override
        public WeatherAdvisoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherAdvisoryStub(channel, callOptions);
        }
      };
    return WeatherAdvisoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherAdvisoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherAdvisoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherAdvisoryBlockingStub>() {
        @java.lang.Override
        public WeatherAdvisoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherAdvisoryBlockingStub(channel, callOptions);
        }
      };
    return WeatherAdvisoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherAdvisoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherAdvisoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherAdvisoryFutureStub>() {
        @java.lang.Override
        public WeatherAdvisoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherAdvisoryFutureStub(channel, callOptions);
        }
      };
    return WeatherAdvisoryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAirQuality(WeatherAdvisory.Spec.AirQualityRequest request,
        io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.AirQualityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAirQualityMethod(), responseObserver);
    }

    /**
     */
    default void getWeather(WeatherAdvisory.Spec.WeatherRequest request,
        io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.WeatherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWeatherMethod(), responseObserver);
    }

    /**
     */
    default void getTravelRecommendation(WeatherAdvisory.Spec.TravelRequest request,
        io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.TravelRecommendationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTravelRecommendationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WeatherAdvisory.
   */
  public static abstract class WeatherAdvisoryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WeatherAdvisoryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WeatherAdvisory.
   */
  public static final class WeatherAdvisoryStub
      extends io.grpc.stub.AbstractAsyncStub<WeatherAdvisoryStub> {
    private WeatherAdvisoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherAdvisoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherAdvisoryStub(channel, callOptions);
    }

    /**
     */
    public void getAirQuality(WeatherAdvisory.Spec.AirQualityRequest request,
        io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.AirQualityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAirQualityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWeather(WeatherAdvisory.Spec.WeatherRequest request,
        io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.WeatherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWeatherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTravelRecommendation(WeatherAdvisory.Spec.TravelRequest request,
        io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.TravelRecommendationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTravelRecommendationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WeatherAdvisory.
   */
  public static final class WeatherAdvisoryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WeatherAdvisoryBlockingStub> {
    private WeatherAdvisoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherAdvisoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherAdvisoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public WeatherAdvisory.Spec.AirQualityResponse getAirQuality(WeatherAdvisory.Spec.AirQualityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAirQualityMethod(), getCallOptions(), request);
    }

    /**
     */
    public WeatherAdvisory.Spec.WeatherResponse getWeather(WeatherAdvisory.Spec.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWeatherMethod(), getCallOptions(), request);
    }

    /**
     */
    public WeatherAdvisory.Spec.TravelRecommendationResponse getTravelRecommendation(WeatherAdvisory.Spec.TravelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTravelRecommendationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WeatherAdvisory.
   */
  public static final class WeatherAdvisoryFutureStub
      extends io.grpc.stub.AbstractFutureStub<WeatherAdvisoryFutureStub> {
    private WeatherAdvisoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherAdvisoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherAdvisoryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WeatherAdvisory.Spec.AirQualityResponse> getAirQuality(
        WeatherAdvisory.Spec.AirQualityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAirQualityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WeatherAdvisory.Spec.WeatherResponse> getWeather(
        WeatherAdvisory.Spec.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWeatherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WeatherAdvisory.Spec.TravelRecommendationResponse> getTravelRecommendation(
        WeatherAdvisory.Spec.TravelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTravelRecommendationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AIR_QUALITY = 0;
  private static final int METHODID_GET_WEATHER = 1;
  private static final int METHODID_GET_TRAVEL_RECOMMENDATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AIR_QUALITY:
          serviceImpl.getAirQuality((WeatherAdvisory.Spec.AirQualityRequest) request,
              (io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.AirQualityResponse>) responseObserver);
          break;
        case METHODID_GET_WEATHER:
          serviceImpl.getWeather((WeatherAdvisory.Spec.WeatherRequest) request,
              (io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.WeatherResponse>) responseObserver);
          break;
        case METHODID_GET_TRAVEL_RECOMMENDATION:
          serviceImpl.getTravelRecommendation((WeatherAdvisory.Spec.TravelRequest) request,
              (io.grpc.stub.StreamObserver<WeatherAdvisory.Spec.TravelRecommendationResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAirQualityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              WeatherAdvisory.Spec.AirQualityRequest,
              WeatherAdvisory.Spec.AirQualityResponse>(
                service, METHODID_GET_AIR_QUALITY)))
        .addMethod(
          getGetWeatherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              WeatherAdvisory.Spec.WeatherRequest,
              WeatherAdvisory.Spec.WeatherResponse>(
                service, METHODID_GET_WEATHER)))
        .addMethod(
          getGetTravelRecommendationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              WeatherAdvisory.Spec.TravelRequest,
              WeatherAdvisory.Spec.TravelRecommendationResponse>(
                service, METHODID_GET_TRAVEL_RECOMMENDATION)))
        .build();
  }

  private static abstract class WeatherAdvisoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherAdvisoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return WeatherAdvisory.Spec.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WeatherAdvisory");
    }
  }

  private static final class WeatherAdvisoryFileDescriptorSupplier
      extends WeatherAdvisoryBaseDescriptorSupplier {
    WeatherAdvisoryFileDescriptorSupplier() {}
  }

  private static final class WeatherAdvisoryMethodDescriptorSupplier
      extends WeatherAdvisoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WeatherAdvisoryMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WeatherAdvisoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherAdvisoryFileDescriptorSupplier())
              .addMethod(getGetAirQualityMethod())
              .addMethod(getGetWeatherMethod())
              .addMethod(getGetTravelRecommendationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
