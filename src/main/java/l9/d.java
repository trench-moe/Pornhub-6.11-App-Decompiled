package l9;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class d {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    public static Map<String, String> a(URI uri, String str) {
        String str2;
        ?? emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap();
            o3.d dVar = new o3.d(new u9.e('='));
            u9.g gVar = u9.g.f15774a;
            u9.j jVar = new u9.j(dVar, false, gVar);
            u9.j jVar2 = new u9.j(new o3.d(new u9.e(Typography.amp)), true, gVar);
            u9.h hVar = new u9.h(jVar2.f15783c, jVar2, rawQuery);
            while (hVar.hasNext()) {
                String str3 = (String) hVar.next();
                Objects.requireNonNull(str3);
                u9.h hVar2 = new u9.h(jVar.f15783c, jVar, str3);
                ArrayList arrayList = new ArrayList();
                while (hVar2.hasNext()) {
                    arrayList.add((String) hVar2.next());
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                try {
                    String decode = URLDecoder.decode((String) unmodifiableList.get(0), str);
                    if (unmodifiableList.size() == 2) {
                        try {
                            str2 = URLDecoder.decode((String) unmodifiableList.get(1), str);
                        } catch (UnsupportedEncodingException e10) {
                            throw new IllegalArgumentException(e10);
                        }
                    } else {
                        str2 = null;
                    }
                    emptyMap.put(decode, str2);
                } catch (UnsupportedEncodingException e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
        }
        return emptyMap;
    }
}
