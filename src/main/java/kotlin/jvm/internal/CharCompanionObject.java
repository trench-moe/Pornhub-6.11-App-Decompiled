package kotlin.jvm.internal;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.SinceKotlin;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/jvm/internal/CharCompanionObject;", BuildConfig.FLAVOR, "()V", "MAX_HIGH_SURROGATE", BuildConfig.FLAVOR, "MAX_LOW_SURROGATE", "MAX_SURROGATE", "MAX_VALUE", "getMAX_VALUE$annotations", "MIN_HIGH_SURROGATE", "MIN_LOW_SURROGATE", "MIN_SURROGATE", "MIN_VALUE", "getMIN_VALUE$annotations", "SIZE_BITS", BuildConfig.FLAVOR, "getSIZE_BITS$annotations", "SIZE_BYTES", "getSIZE_BYTES$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CharCompanionObject {
    public static final CharCompanionObject INSTANCE = new CharCompanionObject();
    public static final char MAX_HIGH_SURROGATE = 56319;
    public static final char MAX_LOW_SURROGATE = 57343;
    public static final char MAX_SURROGATE = 57343;
    public static final char MAX_VALUE = 65535;
    public static final char MIN_HIGH_SURROGATE = 55296;
    public static final char MIN_LOW_SURROGATE = 56320;
    public static final char MIN_SURROGATE = 55296;
    public static final char MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    private CharCompanionObject() {
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void getMAX_VALUE$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void getMIN_VALUE$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}