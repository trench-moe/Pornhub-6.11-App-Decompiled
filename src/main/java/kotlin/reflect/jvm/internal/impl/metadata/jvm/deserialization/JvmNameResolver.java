package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class JvmNameResolver implements NameResolver {
    public static final Companion Companion = new Companion(null);
    private static final List<String> PREDEFINED_STRINGS;
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* renamed from: kotlin  reason: collision with root package name */
    private static final String f12097kotlin;
    private final Set<Integer> localNameIndices;
    private final List<JvmProtoBuf.StringTableTypes.Record> records;
    private final String[] strings;
    private final JvmProtoBuf.StringTableTypes types;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
        f12097kotlin = joinToString$default;
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{Intrinsics.stringPlus(joinToString$default, "/Any"), Intrinsics.stringPlus(joinToString$default, "/Nothing"), Intrinsics.stringPlus(joinToString$default, "/Unit"), Intrinsics.stringPlus(joinToString$default, "/Throwable"), Intrinsics.stringPlus(joinToString$default, "/Number"), Intrinsics.stringPlus(joinToString$default, "/Byte"), Intrinsics.stringPlus(joinToString$default, "/Double"), Intrinsics.stringPlus(joinToString$default, "/Float"), Intrinsics.stringPlus(joinToString$default, "/Int"), Intrinsics.stringPlus(joinToString$default, "/Long"), Intrinsics.stringPlus(joinToString$default, "/Short"), Intrinsics.stringPlus(joinToString$default, "/Boolean"), Intrinsics.stringPlus(joinToString$default, "/Char"), Intrinsics.stringPlus(joinToString$default, "/CharSequence"), Intrinsics.stringPlus(joinToString$default, "/String"), Intrinsics.stringPlus(joinToString$default, "/Comparable"), Intrinsics.stringPlus(joinToString$default, "/Enum"), Intrinsics.stringPlus(joinToString$default, "/Array"), Intrinsics.stringPlus(joinToString$default, "/ByteArray"), Intrinsics.stringPlus(joinToString$default, "/DoubleArray"), Intrinsics.stringPlus(joinToString$default, "/FloatArray"), Intrinsics.stringPlus(joinToString$default, "/IntArray"), Intrinsics.stringPlus(joinToString$default, "/LongArray"), Intrinsics.stringPlus(joinToString$default, "/ShortArray"), Intrinsics.stringPlus(joinToString$default, "/BooleanArray"), Intrinsics.stringPlus(joinToString$default, "/CharArray"), Intrinsics.stringPlus(joinToString$default, "/Cloneable"), Intrinsics.stringPlus(joinToString$default, "/Annotation"), Intrinsics.stringPlus(joinToString$default, "/collections/Iterable"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableIterable"), Intrinsics.stringPlus(joinToString$default, "/collections/Collection"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableCollection"), Intrinsics.stringPlus(joinToString$default, "/collections/List"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableList"), Intrinsics.stringPlus(joinToString$default, "/collections/Set"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableSet"), Intrinsics.stringPlus(joinToString$default, "/collections/Map"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableMap"), Intrinsics.stringPlus(joinToString$default, "/collections/Map.Entry"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableMap.MutableEntry"), Intrinsics.stringPlus(joinToString$default, "/collections/Iterator"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableIterator"), Intrinsics.stringPlus(joinToString$default, "/collections/ListIterator"), Intrinsics.stringPlus(joinToString$default, "/collections/MutableListIterator")});
        PREDEFINED_STRINGS = listOf;
        Iterable<IndexedValue> withIndex = CollectionsKt.withIndex(listOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
        for (IndexedValue indexedValue : withIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    public JvmNameResolver(JvmProtoBuf.StringTableTypes types, String[] strings) {
        Set<Integer> set;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.types = types;
        this.strings = strings;
        List<Integer> localNameList = types.getLocalNameList();
        if (localNameList.isEmpty()) {
            set = SetsKt.emptySet();
        } else {
            Intrinsics.checkNotNullExpressionValue(localNameList, "");
            set = CollectionsKt.toSet(localNameList);
        }
        this.localNameIndices = set;
        ArrayList arrayList = new ArrayList();
        List<JvmProtoBuf.StringTableTypes.Record> recordList = getTypes().getRecordList();
        arrayList.ensureCapacity(recordList.size());
        for (JvmProtoBuf.StringTableTypes.Record record : recordList) {
            int range = record.getRange();
            int i10 = 0;
            while (i10 < range) {
                i10++;
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        Unit unit = Unit.INSTANCE;
        this.records = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i10) {
        return getString(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i10) {
        String string;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i10);
        if (record.hasString()) {
            string = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List<String> list = PREDEFINED_STRINGS;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    string = list.get(record.getPredefinedIndex());
                }
            }
            string = this.strings[i10];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNullExpressionValue(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            Intrinsics.checkNotNullExpressionValue(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                Intrinsics.checkNotNullExpressionValue(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    Intrinsics.checkNotNullExpressionValue(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String string2 = string;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNullExpressionValue(replaceCharList, "replaceCharList");
            Intrinsics.checkNotNullExpressionValue(string2, "string");
            string2 = StringsKt.replace$default(string2, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, (Object) null);
        }
        String string3 = string2;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i11 == 2) {
            Intrinsics.checkNotNullExpressionValue(string3, "string");
            string3 = StringsKt.replace$default(string3, (char) Typography.dollar, '.', false, 4, (Object) null);
        } else if (i11 == 3) {
            if (string3.length() >= 2) {
                Intrinsics.checkNotNullExpressionValue(string3, "string");
                string3 = string3.substring(1, string3.length() - 1);
                Intrinsics.checkNotNullExpressionValue(string3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String string4 = string3;
            Intrinsics.checkNotNullExpressionValue(string4, "string");
            string3 = StringsKt.replace$default(string4, (char) Typography.dollar, '.', false, 4, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(string3, "string");
        return string3;
    }

    public final JvmProtoBuf.StringTableTypes getTypes() {
        return this.types;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return this.localNameIndices.contains(Integer.valueOf(i10));
    }
}
