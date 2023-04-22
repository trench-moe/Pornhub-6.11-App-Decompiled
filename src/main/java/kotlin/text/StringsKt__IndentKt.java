package kotlin.text;

import a0.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", BuildConfig.FLAVOR, "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", BuildConfig.FLAVOR, "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", BuildConfig.FLAVOR, "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return line;
            }
        } : new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return Intrinsics.stringPlus(str, line);
            }
        };
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            int i11 = i10 + 1;
            if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i10))) {
                break;
            }
            i10 = i11;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String prependIndent(String str, final String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$prependIndent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt__StringsJVMKt.isBlank(it) ? it.length() < indent.length() ? indent : it : Intrinsics.stringPlus(indent, it);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i10, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i11 == 0 || i11 == lastIndex) && StringsKt__StringsJVMKt.isBlank(str)) {
                str = null;
            } else {
                String invoke = function12.invoke(str);
                if (invoke != null) {
                    str = function1.invoke(invoke);
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i11 = i12;
        }
        String sb2 = ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(i10), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static final String replaceIndent(String str, String newIndent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> lines = StringsKt__StringsKt.lines(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : lines) {
            if (!StringsKt__StringsJVMKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt(str2)));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable<? extends Comparable>) arrayList2);
        int i10 = 0;
        int intValue = num == null ? 0 : num.intValue();
        int size = (lines.size() * newIndent.length()) + str.length();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : lines) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == lastIndex) && StringsKt__StringsJVMKt.isBlank(str3)) {
                str3 = null;
            } else {
                String drop = StringsKt___StringsKt.drop(str3, intValue);
                if (drop != null) {
                    str3 = indentFunction$StringsKt__IndentKt.invoke(drop);
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) CollectionsKt.joinTo$default(arrayList3, new StringBuilder(size), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndentByMargin(String str, String str2, String str3) {
        int i10;
        a.u(str, "<this>", str2, "newIndent", str3, "marginPrefix");
        if (!StringsKt__StringsJVMKt.isBlank(str3)) {
            List<String> lines = StringsKt__StringsKt.lines(str);
            int size = (lines.size() * str2.length()) + str.length();
            Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
            int lastIndex = CollectionsKt.getLastIndex(lines);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : lines) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i11 == 0 || i11 == lastIndex) && StringsKt__StringsJVMKt.isBlank(str4)) {
                    str4 = null;
                } else {
                    int length = str4.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i10 = -1;
                            break;
                        }
                        int i14 = i13 + 1;
                        if (!CharsKt__CharJVMKt.isWhitespace(str4.charAt(i13))) {
                            i10 = i13;
                            break;
                        }
                        i13 = i14;
                    }
                    if (i10 != -1 && StringsKt__StringsJVMKt.startsWith$default(str4, str3, i10, false, 4, null)) {
                        str5 = str4.substring(str3.length() + i10);
                        Intrinsics.checkNotNullExpressionValue(str5, "this as java.lang.String).substring(startIndex)");
                    }
                    if (str5 != null) {
                        str4 = indentFunction$StringsKt__IndentKt.invoke(str5);
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i11 = i12;
            }
            String sb2 = ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(size), "\n", null, null, 0, null, null, 124, null)).toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        if ((i10 & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    public static final String trimIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, BuildConfig.FLAVOR);
    }

    public static final String trimMargin(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, BuildConfig.FLAVOR, marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}
