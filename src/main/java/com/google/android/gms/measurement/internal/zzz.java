package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzz extends zzkf {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzz(zzkp zzkpVar) {
        super(zzkpVar);
    }

    private final zzt zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzt) this.zzc.get(num);
        }
        zzt zztVar = new zzt(this, this.zza, null);
        this.zzc.put(num, zztVar);
        return zztVar;
    }

    private final boolean zzf(int i10, int i11) {
        zzt zztVar = (zzt) this.zzc.get(Integer.valueOf(i10));
        if (zztVar == null) {
            return false;
        }
        return zzt.zzb(zztVar).get(i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|(2:4|(2:6|7))(2:508|509))|8|(3:10|11|12)|16|(17:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:485|(1:487)(1:489)|488)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:445|(6:446|447|448|449|450|(1:453)(1:452))|454)|44|(5:281|(3:283|(10:285|286|287|288|289|(3:(3:291|(1:293)|294)|296|297)(1:340)|298|299|(6:302|(1:337)(2:306|(8:312|313|(4:316|(2:318|319)(1:321)|320|314)|322|323|(4:326|(2:328|329)(1:331)|330|324)|332|333)(4:308|309|310|311))|334|335|311|300)|339)|353)(1:444)|354|(10:357|(3:361|(4:364|(5:366|367|(1:369)(1:373)|370|371)(1:374)|372|362)|375)|376|(3:380|(4:383|(3:388|389|390)|391|381)|394)|395|(3:397|(6:400|(2:402|(3:404|405|406))(1:409)|407|408|406|398)|410)|411|(3:420|(8:423|(1:425)|426|(1:428)|429|(3:431|432|433)(1:435)|434|421)|436)|437|355)|443)|46|47|(3:175|(4:178|(7:180|(1:182)(1:277)|183|(9:185|186|187|188|189|190|191|192|(3:(11:194|195|196|197|198|199|200|(3:202|203|204)(1:246)|205|206|(1:209)(1:208))|210|211)(4:256|257|242|211))(1:276)|212|(4:215|(3:233|234|235)(6:217|218|(2:219|(2:221|(1:223)(2:224|225))(2:231|232))|(1:227)|228|229)|230|213)|236)(2:278|279)|237|176)|280)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:493|494))|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75)|507|36|37|38|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(2:2|(2:4|(2:6|7))(2:508|509))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:485|(1:487)(1:489)|488)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:445|(6:446|447|448|449|450|(1:453)(1:452))|454)|44|(5:281|(3:283|(10:285|286|287|288|289|(3:(3:291|(1:293)|294)|296|297)(1:340)|298|299|(6:302|(1:337)(2:306|(8:312|313|(4:316|(2:318|319)(1:321)|320|314)|322|323|(4:326|(2:328|329)(1:331)|330|324)|332|333)(4:308|309|310|311))|334|335|311|300)|339)|353)(1:444)|354|(10:357|(3:361|(4:364|(5:366|367|(1:369)(1:373)|370|371)(1:374)|372|362)|375)|376|(3:380|(4:383|(3:388|389|390)|391|381)|394)|395|(3:397|(6:400|(2:402|(3:404|405|406))(1:409)|407|408|406|398)|410)|411|(3:420|(8:423|(1:425)|426|(1:428)|429|(3:431|432|433)(1:435)|434|421)|436)|437|355)|443)|46|47|(3:175|(4:178|(7:180|(1:182)(1:277)|183|(9:185|186|187|188|189|190|191|192|(3:(11:194|195|196|197|198|199|200|(3:202|203|204)(1:246)|205|206|(1:209)(1:208))|210|211)(4:256|257|242|211))(1:276)|212|(4:215|(3:233|234|235)(6:217|218|(2:219|(2:221|(1:223)(2:224|225))(2:231|232))|(1:227)|228|229)|230|213)|236)(2:278|279)|237|176)|280)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:493|494))|507|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0307, code lost:
        if (r5 == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0760, code lost:
        if (r11 != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0928, code lost:
        if (r13 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0a58, code lost:
        if (r7 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0170, code lost:
        if (r5 == null) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0226, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0227, code lost:
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022b, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x022f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0230, code lost:
        r18 = "audience_id";
        r19 = "data";
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b3 A[Catch: SQLiteException -> 0x0226, all -> 0x0b1b, TRY_LEAVE, TryCatch #15 {SQLiteException -> 0x0226, blocks: (B:57:0x01ad, B:59:0x01b3, B:61:0x01c1, B:62:0x01c6, B:63:0x01d1, B:64:0x01e1, B:66:0x01f0), top: B:434:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1 A[Catch: SQLiteException -> 0x0226, all -> 0x0b1b, TRY_ENTER, TryCatch #15 {SQLiteException -> 0x0226, blocks: (B:57:0x01ad, B:59:0x01b3, B:61:0x01c1, B:62:0x01c6, B:63:0x01d1, B:64:0x01e1, B:66:0x01f0), top: B:434:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zza(java.lang.String r66, java.util.List r67, java.util.List r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            Method dump skipped, instructions count: 2851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzz.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }
}
