package dev.simpletimer.bcdice_kt.util

import java.io.File

/**
 * [File]の親ディレクトリが望んでいるディレクトリかを確認します。
 * ZipSlipへの対策
 *
 * @param parent 期待する親ディレクトリ
 * @return 問題がない場合は引数のインスタンスをそのまま返します。問題があった場合はnullを返します。
 * @author mqrimo
 */
fun File.pathSanitizing(parent: File): File? {
    return this.let {
        if (it.toPath().normalize().startsWith(parent.toPath())) {
            it
        } else {
            null
        }
    }
}