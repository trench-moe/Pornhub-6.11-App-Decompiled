package com.google.vrtoolkit.cardboard;

import a1.a;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.vrtoolkit.cardboard.proto.CardboardDevice;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import tc.c;

/* loaded from: classes.dex */
public class CardboardDeviceParams {
    private static final float DEFAULT_INTER_LENS_DISTANCE = 0.06f;
    private static final String DEFAULT_MODEL = "Cardboard v1";
    private static final float DEFAULT_SCREEN_TO_LENS_DISTANCE = 0.042f;
    private static final String DEFAULT_VENDOR = "Google, Inc.";
    private static final float DEFAULT_VERTICAL_DISTANCE_TO_LENS_CENTER = 0.035f;
    private static final int STREAM_SENTINEL = 894990891;
    private static final String TAG = "CardboardDeviceParams";
    private static final String URI_HOST_GOOGLE = "google.com";
    private static final String URI_KEY_PARAMS = "p";
    private static final String URI_PATH_CARDBOARD_CONFIG = "cardboard/cfg";
    private static final String URI_PATH_CARDBOARD_HOME = "cardboard";
    private static final String URI_SCHEME_LEGACY_CARDBOARD = "cardboard";
    private Distortion distortion;
    private boolean hasMagnet;
    private float interLensDistance;
    private FieldOfView leftEyeMaxFov;
    private String model;
    private float screenToLensDistance;
    private String vendor;
    private VerticalAlignmentType verticalAlignment;
    private float verticalDistanceToLensCenter;
    private static final String URI_HOST_LEGACY_CARDBOARD = "v1.0.0";
    private static final Uri URI_ORIGINAL_CARDBOARD_NFC = new Uri.Builder().scheme("cardboard").authority(URI_HOST_LEGACY_CARDBOARD).build();
    private static final String HTTP_SCHEME = "http";
    private static final String URI_HOST_GOOGLE_SHORT = "g.co";
    private static final Uri URI_ORIGINAL_CARDBOARD_QR_CODE = new Uri.Builder().scheme(HTTP_SCHEME).authority(URI_HOST_GOOGLE_SHORT).appendEncodedPath("cardboard").build();
    private static final VerticalAlignmentType DEFAULT_VERTICAL_ALIGNMENT = VerticalAlignmentType.BOTTOM;
    private static final CardboardDeviceParams DEFAULT_PARAMS = new CardboardDeviceParams();

    /* renamed from: com.google.vrtoolkit.cardboard.CardboardDeviceParams$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$vrtoolkit$cardboard$CardboardDeviceParams$VerticalAlignmentType;

        static {
            int[] iArr = new int[VerticalAlignmentType.values().length];
            $SwitchMap$com$google$vrtoolkit$cardboard$CardboardDeviceParams$VerticalAlignmentType = iArr;
            try {
                iArr[VerticalAlignmentType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$vrtoolkit$cardboard$CardboardDeviceParams$VerticalAlignmentType[VerticalAlignmentType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$vrtoolkit$cardboard$CardboardDeviceParams$VerticalAlignmentType[VerticalAlignmentType.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum VerticalAlignmentType {
        BOTTOM(0),
        CENTER(1),
        TOP(2);
        
        private final int protoValue;

        VerticalAlignmentType(int i10) {
            this.protoValue = i10;
        }

        public static VerticalAlignmentType fromProtoValue(int i10) {
            VerticalAlignmentType[] values;
            for (VerticalAlignmentType verticalAlignmentType : values()) {
                if (verticalAlignmentType.protoValue == i10) {
                    return verticalAlignmentType;
                }
            }
            Log.e(CardboardDeviceParams.TAG, String.format("Unknown alignment type from proto: %d", Integer.valueOf(i10)));
            return BOTTOM;
        }

        public int toProtoValue() {
            return this.protoValue;
        }
    }

    public CardboardDeviceParams() {
        setDefaultValues();
    }

    public CardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams) {
        copyFrom(cardboardDeviceParams);
    }

    public CardboardDeviceParams(CardboardDevice.DeviceParams deviceParams) {
        setDefaultValues();
        if (deviceParams == null) {
            return;
        }
        this.vendor = deviceParams.getVendor();
        this.model = deviceParams.getModel();
        this.interLensDistance = deviceParams.getInterLensDistance();
        this.verticalAlignment = VerticalAlignmentType.fromProtoValue(deviceParams.getVerticalAlignment());
        this.verticalDistanceToLensCenter = deviceParams.getTrayToLensDistance();
        this.screenToLensDistance = deviceParams.getScreenToLensDistance();
        FieldOfView parseFromProtobuf = FieldOfView.parseFromProtobuf(deviceParams.leftEyeFieldOfViewAngles);
        this.leftEyeMaxFov = parseFromProtobuf;
        if (parseFromProtobuf == null) {
            this.leftEyeMaxFov = new FieldOfView();
        }
        Distortion parseFromProtobuf2 = Distortion.parseFromProtobuf(deviceParams.distortionCoefficients);
        this.distortion = parseFromProtobuf2;
        if (parseFromProtobuf2 == null) {
            this.distortion = new Distortion();
        }
        this.hasMagnet = deviceParams.getHasMagnet();
    }

    private void copyFrom(CardboardDeviceParams cardboardDeviceParams) {
        this.vendor = cardboardDeviceParams.vendor;
        this.model = cardboardDeviceParams.model;
        this.interLensDistance = cardboardDeviceParams.interLensDistance;
        this.verticalAlignment = cardboardDeviceParams.verticalAlignment;
        this.verticalDistanceToLensCenter = cardboardDeviceParams.verticalDistanceToLensCenter;
        this.screenToLensDistance = cardboardDeviceParams.screenToLensDistance;
        this.leftEyeMaxFov = new FieldOfView(cardboardDeviceParams.leftEyeMaxFov);
        this.hasMagnet = cardboardDeviceParams.hasMagnet;
        this.distortion = new Distortion(cardboardDeviceParams.distortion);
    }

    public static CardboardDeviceParams createFromInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            if (inputStream.read(allocate.array(), 0, allocate.array().length) == -1) {
                Log.e(TAG, "Error parsing param record: end of stream.");
                return null;
            }
            int i10 = allocate.getInt();
            int i11 = allocate.getInt();
            if (i10 != STREAM_SENTINEL) {
                Log.e(TAG, "Error parsing param record: incorrect sentinel.");
                return null;
            }
            byte[] bArr = new byte[i11];
            if (inputStream.read(bArr, 0, i11) == -1) {
                Log.e(TAG, "Error parsing param record: end of stream.");
                return null;
            }
            return new CardboardDeviceParams((CardboardDevice.DeviceParams) c.mergeFrom(new CardboardDevice.DeviceParams(), bArr));
        } catch (InvalidProtocolBufferNanoException e10) {
            String valueOf = String.valueOf(e10.toString());
            Log.w(TAG, valueOf.length() != 0 ? "Error parsing protocol buffer: ".concat(valueOf) : new String("Error parsing protocol buffer: "));
            return null;
        } catch (IOException e11) {
            String valueOf2 = String.valueOf(e11.toString());
            Log.w(TAG, valueOf2.length() != 0 ? "Error reading Cardboard parameters: ".concat(valueOf2) : new String("Error reading Cardboard parameters: "));
            return null;
        }
    }

    public static CardboardDeviceParams createFromNfcContents(NdefMessage ndefMessage) {
        if (ndefMessage == null) {
            Log.w(TAG, "Could not get contents from NFC tag.");
            return null;
        }
        for (NdefRecord ndefRecord : ndefMessage.getRecords()) {
            CardboardDeviceParams createFromUri = createFromUri(ndefRecord.toUri());
            if (createFromUri != null) {
                return createFromUri;
            }
        }
        return null;
    }

    public static CardboardDeviceParams createFromUri(Uri uri) {
        Exception e10;
        CardboardDevice.DeviceParams deviceParams;
        CardboardDevice.DeviceParams deviceParams2 = null;
        if (uri == null) {
            return null;
        }
        if (isOriginalCardboardDeviceUri(uri)) {
            Log.d(TAG, "URI recognized as original cardboard device.");
            CardboardDeviceParams cardboardDeviceParams = new CardboardDeviceParams();
            cardboardDeviceParams.setDefaultValues();
            return cardboardDeviceParams;
        } else if (!isCardboardDeviceUri(uri)) {
            Log.w(TAG, String.format("URI \"%s\" not recognized as cardboard device.", uri));
            return null;
        } else {
            String queryParameter = uri.getQueryParameter("p");
            if (queryParameter != null) {
                try {
                    deviceParams = (CardboardDevice.DeviceParams) c.mergeFrom(new CardboardDevice.DeviceParams(), Base64.decode(queryParameter, 11));
                    try {
                        Log.d(TAG, "Read cardboard params from URI.");
                    } catch (Exception e11) {
                        e10 = e11;
                        String valueOf = String.valueOf(e10.toString());
                        Log.w(TAG, valueOf.length() != 0 ? "Parsing cardboard parameters from URI failed: ".concat(valueOf) : new String("Parsing cardboard parameters from URI failed: "));
                        deviceParams2 = deviceParams;
                        return new CardboardDeviceParams(deviceParams2);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    deviceParams = null;
                }
                deviceParams2 = deviceParams;
            } else {
                Log.w(TAG, "No cardboard parameters in URI.");
            }
            return new CardboardDeviceParams(deviceParams2);
        }
    }

    private static boolean isCardboardDeviceUri(Uri uri) {
        return HTTP_SCHEME.equals(uri.getScheme()) && URI_HOST_GOOGLE.equals(uri.getAuthority()) && "/cardboard/cfg".equals(uri.getPath());
    }

    public static boolean isCardboardUri(Uri uri) {
        if (!isOriginalCardboardDeviceUri(uri) && !isCardboardDeviceUri(uri)) {
            return false;
        }
        return true;
    }

    public static boolean isOriginalCardboardDeviceUri(Uri uri) {
        if (!URI_ORIGINAL_CARDBOARD_QR_CODE.equals(uri)) {
            Uri uri2 = URI_ORIGINAL_CARDBOARD_NFC;
            if (!uri2.getScheme().equals(uri.getScheme()) || !uri2.getAuthority().equals(uri.getAuthority())) {
                return false;
            }
        }
        return true;
    }

    private void setDefaultValues() {
        this.vendor = DEFAULT_VENDOR;
        this.model = DEFAULT_MODEL;
        this.interLensDistance = DEFAULT_INTER_LENS_DISTANCE;
        this.verticalAlignment = DEFAULT_VERTICAL_ALIGNMENT;
        this.verticalDistanceToLensCenter = DEFAULT_VERTICAL_DISTANCE_TO_LENS_CENTER;
        this.screenToLensDistance = DEFAULT_SCREEN_TO_LENS_DISTANCE;
        this.leftEyeMaxFov = new FieldOfView();
        this.hasMagnet = true;
        this.distortion = new Distortion();
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof CardboardDeviceParams) {
            CardboardDeviceParams cardboardDeviceParams = (CardboardDeviceParams) obj;
            if (this.vendor.equals(cardboardDeviceParams.vendor)) {
                if (this.model.equals(cardboardDeviceParams.model)) {
                    if (this.interLensDistance == cardboardDeviceParams.interLensDistance) {
                        VerticalAlignmentType verticalAlignmentType = this.verticalAlignment;
                        if (verticalAlignmentType == cardboardDeviceParams.verticalAlignment) {
                            if (verticalAlignmentType != VerticalAlignmentType.CENTER) {
                                if (this.verticalDistanceToLensCenter == cardboardDeviceParams.verticalDistanceToLensCenter) {
                                }
                            }
                            if (this.screenToLensDistance == cardboardDeviceParams.screenToLensDistance && this.leftEyeMaxFov.equals(cardboardDeviceParams.leftEyeMaxFov) && this.distortion.equals(cardboardDeviceParams.distortion) && this.hasMagnet == cardboardDeviceParams.hasMagnet) {
                                z10 = true;
                            }
                        }
                    }
                }
            }
            return z10;
        }
        return false;
    }

    public Distortion getDistortion() {
        return this.distortion;
    }

    public boolean getHasMagnet() {
        return this.hasMagnet;
    }

    public float getInterLensDistance() {
        return this.interLensDistance;
    }

    public FieldOfView getLeftEyeMaxFov() {
        return this.leftEyeMaxFov;
    }

    public String getModel() {
        return this.model;
    }

    public float getScreenToLensDistance() {
        return this.screenToLensDistance;
    }

    public String getVendor() {
        return this.vendor;
    }

    public VerticalAlignmentType getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public float getVerticalDistanceToLensCenter() {
        return this.verticalDistanceToLensCenter;
    }

    public float getYEyeOffsetMeters(ScreenParams screenParams) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$vrtoolkit$cardboard$CardboardDeviceParams$VerticalAlignmentType[getVerticalAlignment().ordinal()];
        return i10 != 2 ? i10 != 3 ? screenParams.getHeightMeters() / 2.0f : screenParams.getHeightMeters() - (getVerticalDistanceToLensCenter() - screenParams.getBorderSizeMeters()) : getVerticalDistanceToLensCenter() - screenParams.getBorderSizeMeters();
    }

    public boolean isDefault() {
        return DEFAULT_PARAMS.equals(this);
    }

    public void setHasMagnet(boolean z10) {
        this.hasMagnet = z10;
    }

    public void setInterLensDistance(float f10) {
        this.interLensDistance = f10;
    }

    public void setModel(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.model = str;
    }

    public void setScreenToLensDistance(float f10) {
        this.screenToLensDistance = f10;
    }

    public void setVendor(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.vendor = str;
    }

    public void setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
        this.verticalAlignment = verticalAlignmentType;
    }

    public void setVerticalDistanceToLensCenter(float f10) {
        this.verticalDistanceToLensCenter = f10;
    }

    public byte[] toByteArray() {
        CardboardDevice.DeviceParams deviceParams = new CardboardDevice.DeviceParams();
        deviceParams.setVendor(this.vendor);
        deviceParams.setModel(this.model);
        deviceParams.setInterLensDistance(this.interLensDistance);
        deviceParams.setVerticalAlignment(this.verticalAlignment.toProtoValue());
        if (this.verticalAlignment == VerticalAlignmentType.CENTER) {
            deviceParams.setTrayToLensDistance(DEFAULT_VERTICAL_DISTANCE_TO_LENS_CENTER);
        } else {
            deviceParams.setTrayToLensDistance(this.verticalDistanceToLensCenter);
        }
        deviceParams.setScreenToLensDistance(this.screenToLensDistance);
        deviceParams.leftEyeFieldOfViewAngles = this.leftEyeMaxFov.toProtobuf();
        deviceParams.distortionCoefficients = this.distortion.toProtobuf();
        boolean z10 = this.hasMagnet;
        if (z10) {
            deviceParams.setHasMagnet(z10);
        }
        return c.toByteArray(deviceParams);
    }

    public String toString() {
        StringBuilder m10 = a.m("{\n");
        String str = this.vendor;
        StringBuilder sb2 = new StringBuilder(a0.a.e(str, 12));
        sb2.append("  vendor: ");
        sb2.append(str);
        sb2.append(",\n");
        m10.append(sb2.toString());
        String str2 = this.model;
        StringBuilder sb3 = new StringBuilder(a0.a.e(str2, 11));
        sb3.append("  model: ");
        sb3.append(str2);
        sb3.append(",\n");
        m10.append(sb3.toString());
        float f10 = this.interLensDistance;
        StringBuilder sb4 = new StringBuilder(40);
        sb4.append("  inter_lens_distance: ");
        sb4.append(f10);
        sb4.append(",\n");
        m10.append(sb4.toString());
        String valueOf = String.valueOf(this.verticalAlignment);
        StringBuilder sb5 = new StringBuilder(valueOf.length() + 24);
        sb5.append("  vertical_alignment: ");
        sb5.append(valueOf);
        sb5.append(",\n");
        m10.append(sb5.toString());
        float f11 = this.verticalDistanceToLensCenter;
        StringBuilder sb6 = new StringBuilder(53);
        sb6.append("  vertical_distance_to_lens_center: ");
        sb6.append(f11);
        sb6.append(",\n");
        m10.append(sb6.toString());
        float f12 = this.screenToLensDistance;
        StringBuilder sb7 = new StringBuilder(44);
        sb7.append("  screen_to_lens_distance: ");
        sb7.append(f12);
        sb7.append(",\n");
        m10.append(sb7.toString());
        String valueOf2 = String.valueOf(this.leftEyeMaxFov.toString().replace("\n", "\n  "));
        StringBuilder sb8 = new StringBuilder(valueOf2.length() + 22);
        sb8.append("  left_eye_max_fov: ");
        sb8.append(valueOf2);
        sb8.append(",\n");
        m10.append(sb8.toString());
        String valueOf3 = String.valueOf(this.distortion.toString().replace("\n", "\n  "));
        StringBuilder sb9 = new StringBuilder(valueOf3.length() + 16);
        sb9.append("  distortion: ");
        sb9.append(valueOf3);
        sb9.append(",\n");
        m10.append(sb9.toString());
        boolean z10 = this.hasMagnet;
        StringBuilder sb10 = new StringBuilder(17);
        sb10.append("  magnet: ");
        sb10.append(z10);
        sb10.append(",\n");
        m10.append(sb10.toString());
        m10.append("}\n");
        return m10.toString();
    }

    public Uri toUri() {
        byte[] byteArray = toByteArray();
        return new Uri.Builder().scheme(HTTP_SCHEME).authority(URI_HOST_GOOGLE).appendEncodedPath(URI_PATH_CARDBOARD_CONFIG).appendQueryParameter("p", Base64.encodeToString(byteArray, 0, byteArray.length, 11)).build();
    }

    public boolean writeToOutputStream(OutputStream outputStream) {
        try {
            byte[] byteArray = toByteArray();
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(STREAM_SENTINEL);
            allocate.putInt(byteArray.length);
            outputStream.write(allocate.array());
            outputStream.write(byteArray);
            return true;
        } catch (IOException e10) {
            String valueOf = String.valueOf(e10.toString());
            Log.w(TAG, valueOf.length() != 0 ? "Error writing Cardboard parameters: ".concat(valueOf) : new String("Error writing Cardboard parameters: "));
            return false;
        }
    }
}
