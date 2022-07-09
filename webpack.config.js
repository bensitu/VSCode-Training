const path = require('path');

module.exports = {
  // production 生产环境
  // 或 development 开发环境
  mode: 'production',

  // 打包的起点
  entry: './src/app.js',

  // 打包的输出
  output: {
    filename: 'bundle.js',
    // 输出目录的绝对路径和相对路径（相对网站目录）
    path: path.resolve(__dirname, 'dist'),
    publicPath: '/'
  },

  // 模块，装载器等，见下文
  module: {},

  // 插件，`.css` 的剥离和压缩、`.html` 的动态生成等，见下文
  plugins: []
};