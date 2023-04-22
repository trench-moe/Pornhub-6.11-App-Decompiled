package ue;

import com.appsflyer.oaid.BuildConfig;
import java.net.ProtocolException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;

/* loaded from: classes3.dex */
public final class j {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final Protocol f15896a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final int f15897b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final String f15898c;

    public j(Protocol protocol, int i10, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f15896a = protocol;
        this.f15897b = i10;
        this.f15898c = message;
    }

    public static final j a(String statusLine) {
        String str;
        Protocol protocol = Protocol.HTTP_1_0;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        int i10 = 9;
        if (StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (Object) null)) {
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException(a1.a.l("Unexpected status line: ", statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(a1.a.l("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (!StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (Object) null)) {
            throw new ProtocolException(a1.a.l("Unexpected status line: ", statusLine));
        } else {
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (statusLine.length() >= i11) {
            try {
                String substring = statusLine.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i11) {
                    str = BuildConfig.FLAVOR;
                } else if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException(a1.a.l("Unexpected status line: ", statusLine));
                } else {
                    str = statusLine.substring(i10 + 4);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).substring(startIndex)");
                }
                return new j(protocol, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a1.a.l("Unexpected status line: ", statusLine));
            }
        }
        throw new ProtocolException(a1.a.l("Unexpected status line: ", statusLine));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f15896a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f15897b);
        sb2.append(' ');
        sb2.append(this.f15898c);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
