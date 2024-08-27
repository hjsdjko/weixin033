<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#ffffff","display":"flex","height":"100%"}'>
		<swiper :style='{"width":"100%","background":"#ffffff","height":"360rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#069888' indicator-color='#06988830' :duration='500' :interval='5000' :vertical='true'>
			<swiper-item :style='{"width":"100%","background":"#ffffff","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","padding":"20rpx","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333333","background":"#ffffff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"20rpx 20rpx 20rpx 36rpx","margin":"20rpx 0 0 0","flexWrap":"wrap","background":"#ffffff","display":"flex","width":"100%","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
					<view v-if="menu.childs.length" :style='{"border":"2rpx solid #b4f2eb","padding":"12rpx 0 12rpx 0","margin":"10rpx 3% 20rpx 0","borderRadius":"16rpx","background":"#06988810","width":"30%","height":"auto"}' class="menu-list" @tap="menuClick(menu,index)">
						<view class="iconarr" :class="menu.fontClass" :style='{"padding":"0 0 0 0","margin":"0 auto 0 auto","color":"#333333","borderRadius":"100%","background":"none","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
						<view :style='{"padding":"0 0 0 0","margin":"12rpx auto 0 auto","color":"#333333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{menu.menu}}</view>
					</view>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<view class="listBox recommend" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"1"}'>
			<view v-if="true && 3 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"100%","padding":"0 24rpx 0 24rpx","margin":"0 0 24rpx 0","background":"url(http://codegen.caihongy.cn/20230815/6367cec65c9f4fb9bcfa04bb3d86bf4b.png) no-repeat center top / 100%  100%"}'>
				<view :style='{"width":"100%","fontSize":"36rpx","lineHeight":"120rpx","color":"#333333","textAlign":"center"}'>菜品信息推荐</view>
			</view>
			
			<view v-if="true && 3 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			
			
			
			  
			<!-- 样式5 -->
			<view class="list-box style5">
				<swiper :style='{"width":"calc(100% - 40rpx)","margin":"40rpx auto 40rpx auto","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='#00000030' :duration='500' :interval='5000' :vertical='false'>
					<swiper-item :style='{"width":"100%","background":"#fff","height":"360rpx"}' @tap="onDetailTap('caipinxinxi',product.id)" v-for="(product,index) in caipinxinxilist" :key="index">
						<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>{{product.caipinmingcheng}}</view>
						<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' class="list-item-image" mode="aspectFill" v-if="product.caipintupian.substring(0,4)=='http'" :src="product.caipintupian"></image>
						<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.caipintupian?baseUrl+product.caipintupian.split(',')[0]:''"></image>
						<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>价格:{{product.price}}</view>
					</swiper-item>
				</swiper>
			</view>
			
			
			  
			
			  
			<view v-if="true && 3 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																																																								<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
																																																								<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 3,
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				caipinxinxilist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			let role = '管理员'
			this.menuList.forEach((item,key) => {
			    if(role==item.roleName) {
			        item.frontMenu.forEach((item2,key2) => {
						if(item2.child.length) {
							item2.childs = []
						    item2.child.forEach((item3,key3)=>{
								if(item3.buttons.indexOf("查看")>-1){
									item2.childs.push(item3)
									this.swiperMenuList.push(item3);
								}
							})
						}
			            
			        })
			    }
			})
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}

			// 推荐信息
			if(uni.getStorageSync("userid")) {
				res = await this.$api.recommend2('caipinxinxi', {                                              
                    page: 1,
                    limit: 4
                });
			} else {
				res = await this.$api.recommend('caipinxinxi', {                                              
                    page: 1,
                    limit: 4
                });
			}
			this.caipinxinxilist = res.data.list

		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(tableName=='news'){
					uni.navigateTo({
						url: `../news-list/news-list`,
						fail: function(){
							uni.switchTab({
								url: `../news-list/news-list`
							});
						}
					});
					return false
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
			menuClick(menu, index) {
				if (menu.childs.length > 0 && menu.childs.length == 1) {
					uni.navigateTo({
						url: `../${menu.childs[0].tableName}/list`,
						fail: function() {
							uni.switchTab({
								url: `../${menu.childs[0].tableName}/list`
							});
						}
					});
				} else if (menu.childs.length > 1) {
					let arr = []
					for(let x in menu.childs){
						arr.push(menu.childs[x].menu.length>6?menu.childs[x].menu.substring(0,6):menu.childs[x].menu)
					}
					uni.showActionSheet({
						itemList: arr,
						success: function (res) {
							uni.navigateTo({
								url: `../${menu.childs[res.tapIndex].tableName}/list`,
								fail: function() {
									uni.switchTab({
										url: `../${menu.childs[res.tapIndex].tableName}/list`
									});
								}
							});
						}
					});
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
