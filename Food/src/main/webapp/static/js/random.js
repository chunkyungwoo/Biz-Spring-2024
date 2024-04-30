document.addEventListener("DOMContentLoaded", function () {
  const arrow = document.querySelector(".arrow");
  let isSpinning = false;

  function spinRoulette() {
    if (!isSpinning) {
      isSpinning = true;
      arrow.style.transition = "transform 8s ease-in-out";
      arrow.style.transform = `rotate(3600deg) translate(-50%, -50%)`; // 중앙으로 이동
      setTimeout(() => {
        stopArrow();
      }, 8000);
    }
  }

  function stopArrow() {
    const stopDeg = Math.floor(Math.random() * 360); // 랜덤한 각도를 설정합니다.
    arrow.style.transition = "transform 2s ease-in-out";
    arrow.style.transform = `rotate(${stopDeg}deg) translate(-50%, -50%)`;
    setTimeout(() => {
      isSpinning = false;
      showSelectedFood(stopDeg);
    }, 2000);
  }

  function showSelectedFood(angle) {
    const foodList = document.querySelector(".food-list");
    const foodItems = foodList.querySelectorAll("li");
    const numItems = foodItems.length;
    const index = Math.floor((angle % 360) / (360 / numItems));
    alert("선택된 음식: " + foodItems[index].innerText);
  }

  document
    .getElementById("randomButton")
    .addEventListener("click", spinRoulette);
});
