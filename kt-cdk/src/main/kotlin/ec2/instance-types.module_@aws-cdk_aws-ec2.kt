@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external enum class InstanceClass {
    STANDARD3 /* = "m3" */,
    M3 /* = "m3" */,
    STANDARD4 /* = "m4" */,
    M4 /* = "m4" */,
    STANDARD5 /* = "m5" */,
    M5 /* = "m5" */,
    STANDARD5_NVME_DRIVE /* = "m5d" */,
    M5D /* = "m5d" */,
    STANDARD5_AMD /* = "m5a" */,
    M5A /* = "m5a" */,
    STANDARD5_AMD_NVME_DRIVE /* = "m5ad" */,
    M5AD /* = "m5ad" */,
    MEMORY3 /* = "r3" */,
    R3 /* = "r3" */,
    MEMORY4 /* = "r4" */,
    R4 /* = "r4" */,
    MEMORY5 /* = "r5" */,
    R5 /* = "r5" */,
    MEMORY5_HIGH_PERFORMANCE /* = "r5n" */,
    R5N /* = "r5n" */,
    MEMORY5_NVME_DRIVE /* = "r5d" */,
    R5D /* = "r5d" */,
    MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE /* = "r5dn" */,
    R5DN /* = "r5dn" */,
    MEMORY5_AMD /* = "r5a" */,
    R5A /* = "r5a" */,
    MEMORY5_AMD_NVME_DRIVE /* = "r5a" */,
    R5AD /* = "r5a" */,
    COMPUTE3 /* = "c3" */,
    C3 /* = "c3" */,
    COMPUTE4 /* = "c4" */,
    C4 /* = "c4" */,
    COMPUTE5 /* = "c5" */,
    C5 /* = "c5" */,
    COMPUTE5_NVME_DRIVE /* = "c5d" */,
    C5D /* = "c5d" */,
    COMPUTE5_HIGH_PERFORMANCE /* = "c5n" */,
    C5N /* = "c5n" */,
    STORAGE2 /* = "d2" */,
    D2 /* = "d2" */,
    STORAGE_COMPUTE_1 /* = "h1" */,
    H1 /* = "h1" */,
    IO3 /* = "i3" */,
    I3 /* = "i3" */,
    IO3_DENSE_NVME_DRIVE /* = "i3en" */,
    I3EN /* = "i3en" */,
    BURSTABLE2 /* = "t2" */,
    T2 /* = "t2" */,
    BURSTABLE3 /* = "t3" */,
    T3 /* = "t3" */,
    BURSTABLE3_AMD /* = "t3a" */,
    T3A /* = "t3a" */,
    MEMORY_INTENSIVE_1 /* = "x1" */,
    X1 /* = "x1" */,
    MEMORY_INTENSIVE_1_EXTENDED /* = "x1e" */,
    X1E /* = "x1e" */,
    FPGA1 /* = "f1" */,
    F1 /* = "f1" */,
    GRAPHICS3 /* = "g3" */,
    G3 /* = "g3" */,
    GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE /* = "g4dn" */,
    G4DN /* = "g4dn" */,
    PARALLEL2 /* = "p2" */,
    P2 /* = "p2" */,
    PARALLEL3 /* = "p3" */,
    P3 /* = "p3" */,
    ARM1 /* = "a1" */,
    A1 /* = "a1" */,
    STANDARD6_GRAVITON /* = "m6g" */,
    M6G /* = "m6g" */,
    HIGH_COMPUTE_MEMORY1 /* = "z1d" */,
    Z1D /* = "z1d" */,
    INFERENCE1 /* = "inf1" */,
    INF1 /* = "inf1" */
}

external enum class InstanceSize {
    NANO /* = "nano" */,
    MICRO /* = "micro" */,
    SMALL /* = "small" */,
    MEDIUM /* = "medium" */,
    LARGE /* = "large" */,
    XLARGE /* = "xlarge" */,
    XLARGE2 /* = "2xlarge" */,
    XLARGE4 /* = "4xlarge" */,
    XLARGE8 /* = "8xlarge" */,
    XLARGE9 /* = "9xlarge" */,
    XLARGE10 /* = "10xlarge" */,
    XLARGE12 /* = "12xlarge" */,
    XLARGE16 /* = "16xlarge" */,
    XLARGE18 /* = "18xlarge" */,
    XLARGE24 /* = "24xlarge" */,
    XLARGE32 /* = "32xlarge" */,
    METAL /* = "metal" */
}

external open class InstanceType(instanceTypeIdentifier: String) {
    open var instanceTypeIdentifier: Any
    override fun toString(): String

    companion object {
        fun of(instanceClass: InstanceClass, instanceSize: InstanceSize): InstanceType
    }
}