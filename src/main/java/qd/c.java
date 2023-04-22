package qd;

import java.util.Locale;
import l9.e;
import md.p;

/* loaded from: classes2.dex */
public class c implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14505a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final String[][] f14506b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        b(200, "OK");
        b(201, "Created");
        b(202, "Accepted");
        b(204, "No Content");
        b(301, "Moved Permanently");
        b(302, "Moved Temporarily");
        b(304, "Not Modified");
        b(400, "Bad Request");
        b(401, "Unauthorized");
        b(403, "Forbidden");
        b(404, "Not Found");
        b(500, "Internal Server Error");
        b(501, "Not Implemented");
        b(502, "Bad Gateway");
        b(503, "Service Unavailable");
        b(100, "Continue");
        b(307, "Temporary Redirect");
        b(405, "Method Not Allowed");
        b(409, "Conflict");
        b(412, "Precondition Failed");
        b(413, "Request Too Long");
        b(414, "Request-URI Too Long");
        b(415, "Unsupported Media Type");
        b(300, "Multiple Choices");
        b(303, "See Other");
        b(305, "Use Proxy");
        b(402, "Payment Required");
        b(406, "Not Acceptable");
        b(407, "Proxy Authentication Required");
        b(408, "Request Timeout");
        b(101, "Switching Protocols");
        b(203, "Non Authoritative Information");
        b(205, "Reset Content");
        b(206, "Partial Content");
        b(504, "Gateway Timeout");
        b(505, "Http Version Not Supported");
        b(410, "Gone");
        b(411, "Length Required");
        b(416, "Requested Range Not Satisfiable");
        b(417, "Expectation Failed");
        b(102, "Processing");
        b(207, "Multi-Status");
        b(422, "Unprocessable Entity");
        b(419, "Insufficient Space On Resource");
        b(420, "Method Failure");
        b(423, "Locked");
        b(507, "Insufficient Storage");
        b(424, "Failed Dependency");
    }

    public static void b(int i10, String str) {
        int i11 = i10 / 100;
        f14506b[i11][i10 - (i11 * 100)] = str;
    }

    @Override // md.p
    public String a(int i10, Locale locale) {
        boolean z10 = i10 >= 100 && i10 < 600;
        e.a(z10, "Unknown category for status code " + i10);
        int i11 = i10 / 100;
        int i12 = i10 - (i11 * 100);
        String str = null;
        String[][] strArr = f14506b;
        if (strArr[i11].length > i12) {
            str = strArr[i11][i12];
        }
        return str;
    }
}
