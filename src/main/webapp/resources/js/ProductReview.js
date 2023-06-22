<script>
class TabsAutomatic {
		                constructor(groupNode) {
		                  this.tablistNode = groupNode;
		                  console.log(groupNode);
		                  this.tabs = [];
		                  
		                  this.firstTab = null;
		                  this.lastTab = null;
		                  
		                  this.tabs = Array.from(this.tablistNode.querySelectorAll('[role=tab]'));
		                  //Array.from 은 유사 배열 객체들을 배열과 같이 만들어 주는 역할을 한다.
		                  this.tabpanels = [];
		                  
		                  for (var i = 0; i < this.tabs.length; i += 1) {
		                    var tab = this.tabs[i];
		                    var tabpanel = document.getElementById(tab.getAttribute('aria-controls'));
		                    
		                    tab.tabIndex = -1;
		                    tab.setAttribute('aria-selected', 'false');
		                    this.tabpanels.push(tabpanel);
		                    
		                    tab.addEventListener('keydown', this.onKeydown.bind(this));
		                    tab.addEventListener('click', this.onClick.bind(this));
		                    
		                    if (!this.firstTab) {
		                      this.firstTab = tab;
		                    }
		                    this.lastTab = tab;
		                  }
		                  
		                  this.setSelectedTab(this.firstTab, false);
		                }
		                
		                setSelectedTab(currentTab, setFocus) {
		                  if (typeof setFocus !== 'boolean') {
		                    setFocus = true;
		                  }
		                  for (var i = 0; i < this.tabs.length; i += 1) {
		                    var tab = this.tabs[i];
		                    if (currentTab === tab) {
		                      tab.setAttribute('aria-selected', 'true');//element.setAttribute( 'attributename', 'attributevalue' )
		                      tab.removeAttribute('tabindex');//element.removeAttribute('attributename')
		                      this.tabpanels[i].classList.remove('is-hidden');//classList 를 사용하면 
		                      //class명을 변경할 때 이전의 클래스가 사라지는 경우를 방지해준다.
		                      if (setFocus) {
		                        tab.focus();
		                      }
		                    } else {
		                      tab.setAttribute('aria-selected', 'false');
		                      tab.tabIndex = -1;
		                      this.tabpanels[i].classList.add('is-hidden');
		                    }
		                  }
		                }
		                
		                setSelectedToPreviousTab(currentTab) {
		                  var index;
		                  
		                  if (currentTab === this.firstTab) {
		                    this.setSelectedTab(this.lastTab);
		                  } else {
		                    index = this.tabs.indexOf(currentTab);
		                    this.setSelectedTab(this.tabs[index - 1]);
		                  }
		                }
		                
		                setSelectedToNextTab(currentTab) {
		                  var index;

		                  if (currentTab === this.lastTab) {
		                    this.setSelectedTab(this.firstTab);
		                  } else {
		                    index = this.tabs.indexOf(currentTab);
		                    this.setSelectedTab(this.tabs[index + 1]);
		                  }
		                }
		                
		                /* EVENT HANDLERS */
		                
		                onKeydown(event) {
		                  var tgt = event.currentTarget,
		                  flag = false;
		                  
		                  switch (event.key) {
		                    case 'ArrowLeft':
		                    this.setSelectedToPreviousTab(tgt);//이전 탭을 선택하라는거 같은데
		                    flag = true;
		                    break;
		                    
		                    case 'ArrowRight':
		                    this.setSelectedToNextTab(tgt);//다음탭을 선택해라
		                    flag = true;
		                    break;
		                    
		                    case 'Home':
		                    this.setSelectedTab(this.firstTab);//home키 누르면 첫번째 탭 선택해라
		                    flag = true;
		                    break;
		                    
		                    case 'End':
		                    this.setSelectedTab(this.lastTab);//end키 누르면 마지막 탭 선택해라
		                    flag = true;
		                    break;
		                    
		                    default:
		                    break;
		                  }
		                  
		                  if (flag) {
		                    event.stopPropagation();
		                    event.preventDefault();
		                  }
		                }
		                
		                onClick(event) {
		                  this.setSelectedTab(event.currentTarget);
		                }
		              }
		              
		              // Initialize tablist
		              
		              window.addEventListener('load', function () {
		                var tablists = document.querySelectorAll('[role=tablist].automatic');//class automatic
		                for (var i = 0; i < tablists.length; i++) {
		                  new TabsAutomatic(tablists[i]);
		                }
		              });

			
			
			//modal
			$(function(){
		              $('.btn-open-popup').on("click",function(){
		                    $('.modal').addClass('show')
		                    $('body').css('overflow','hidden')
		                  
		                  })

		                    $('.modal_close_btn').on("click",function(){
		                      $('.modal').removeClass('show')
		                      $('body').css('overflow','auto')
		                    })
		                    $('body').on('click',function(){
		                      if($('modal').hasClass('show')){
		                        $('.modal').removeClass('show')
		                        $('body').css('overflow','auto')
		                    }
		                    })
						});

//별점 
						  $(function(){
						    var $star = $(".star-input"),
						    $result = $star.find("output>b");
							
						      $(document)
						     .on("focusin", ".star-input>.input", 
						      function(){
						        $(this).addClass("focus");
						      })
								 
						    	.on("focusout", ".star-input>.input", function(){
						    	var $this = $(this);
						    	setTimeout(function(){
						      		if($this.find(":focus").length === 0){
						       			$this.removeClass("focus");
						     	 	}
						   		}, 100);
						 	    })
						      
						      .on("change", ".star-input :radio", function(){
						        $result.text($(this).next().text());
						      })
						      .on("mouseover", ".star-input label", function(){
						        $result.text($(this).text());
						      })
						      .on("mouseleave", ".star-input>.input", function(){
						        var $checked = $star.find(":checked");
						      if($checked.length === 0){
						        $result.text("0/5");
						      } else {
						        $result.text($checked.next().text());
						      }
						    });
						  });
</script>
