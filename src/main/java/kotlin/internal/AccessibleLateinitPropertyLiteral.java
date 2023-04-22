package kotlin.internal;

import com.appsflyer.oaid.BuildConfig;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.PARAMETER})
@SinceKotlin(version = "1.2")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/internal/AccessibleLateinitPropertyLiteral;", BuildConfig.FLAVOR, "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes3.dex */
public @interface AccessibleLateinitPropertyLiteral {
}