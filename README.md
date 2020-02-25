# Not Enough Characters

一个改进 1.7.10 中 NEI 搜索功能的 mod

## 主要功能

- 用全拼、首字母混合搜索汉字，如「夜视药水」可用 `yshiysh` 搜索到
- 用空格分割搜索关键字，如「喷溅型夜视药水」可用 `ysys pjx` 搜索到
- 用 `@` 前缀限制搜索范围至某些 mod，如匠魂中的「混凝土」可用 `@tcon hnt` 搜索到

## 注意事项

此 mod 仅在 GT New Horizons 整合包开发者 fork 的 NEI 2.0 上测试过。理论上也应该支持原版 NEI 1.x，但不作保证。

推荐原版 NEI 用户升级至上述的修改版 NEI，因为它极大地改进了 NEI 的搜索性能，并且移植了一些 JEI 的功能进来。

## 鸣谢

此 mod 的核心功能基于 [JustEnoughCharacters](https://github.com/Towdium/JustEnoughCharacters) 的作者开发的拼音匹配工具 [PinIn](https://github.com/Towdium/PinIn)。

PinIn 实现了一套基于树的拼音匹配算法……算了，我没有这方面的知识，而且词穷，反正就是：非常智能！性能很好！吹爆！

## 协议

此项目是采用 GNU General Public License v3 or later 协议的自由软件。
